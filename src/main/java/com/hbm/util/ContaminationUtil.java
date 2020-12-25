package com.hbm.util;

import com.hbm.handler.HazmatRegistry;
import com.hbm.interfaces.IRadiationImmune;
import com.hbm.potion.HbmPotion;
import com.hbm.saveddata.RadiationSavedData;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class ContaminationUtil {
	
	/**
	 * Calculates how much radiation can be applied to this entity by calculating resistance
	 * @param entity
	 * @return
	 */
	public static float calculateRadiationMod(EntityLivingBase entity) {

		if(entity.isPotionActive(HbmPotion.mutation))
			return 0;
		
		if(entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)entity;
			
			float koeff = 5.0F;
			return (float) Math.pow(koeff, -HazmatRegistry.getResistance(player));
		}
		
		return 1;
	}
	
	public static void applyRadData(Entity e, float f) {

		if(!(e instanceof EntityLivingBase))
			return;

		if(e instanceof IRadiationImmune)
			return;
		
		if(e instanceof EntityPlayer && ((EntityPlayer)e).capabilities.isCreativeMode)
			return;
		
		if(e instanceof EntityPlayer && e.ticksExisted < 200)
			return;
		
		EntityLivingBase entity = (EntityLivingBase)e;
		
		f *= calculateRadiationMod(entity);

		float rad = e.getEntityData().getFloat("hfr_radiation");
		e.getEntityData().setFloat("hfr_radiation", Math.min(rad + f, 2500));
	}
	
	public static void applyRadDirect(Entity e, float f) {

		if(!(e instanceof EntityLivingBase))
			return;

		if(e instanceof IRadiationImmune)
			return;
		
		if(e instanceof EntityPlayer && ((EntityPlayer)e).capabilities.isCreativeMode)
			return;
		
		if(((EntityLivingBase)e).isPotionActive(HbmPotion.mutation))
			return;
		
		float rad = e.getEntityData().getFloat("hfr_radiation");
		e.getEntityData().setFloat("hfr_radiation", Math.min(rad + f, 2500));
	}
	
	public static float getRads(Entity e) {

		if(!(e instanceof EntityLivingBase))
			return 0.0F;

		if(e instanceof IRadiationImmune)
			return 0.0F;
		
		return e.getEntityData().getFloat("hfr_radiation");
	}
	
	public static void printGeigerData(EntityPlayer player) {

		World world = player.worldObj;

		double eRad = ((int)(player.getEntityData().getFloat("hfr_radiation") * 10)) / 10D;

		RadiationSavedData data = RadiationSavedData.getData(player.worldObj);
		Chunk chunk = world.getChunkFromBlockCoords((int)player.posX, (int)player.posZ);
		double rads = ((int)(data.getRadNumFromCoord(chunk.xPosition, chunk.zPosition) * 10)) / 10D;
		
		double res = 100.0D - ((int)(ContaminationUtil.calculateRadiationMod(player) * 10000)) / 100D;
		double resKoeff = ((int)(HazmatRegistry.getResistance(player) * 100)) / 100D;
		
		String chunkPrefix = "";
		String radPrefix = "";
		String resPrefix = "" + EnumChatFormatting.WHITE;
		
		if(rads == 0)
			chunkPrefix += EnumChatFormatting.GREEN;
		else if(rads < 1)
			chunkPrefix += EnumChatFormatting.YELLOW;
		else if(rads < 10)
			chunkPrefix += EnumChatFormatting.GOLD;
		else if(rads < 100)
			chunkPrefix += EnumChatFormatting.RED;
		else if(rads < 1000)
			chunkPrefix += EnumChatFormatting.DARK_RED;
		else
			chunkPrefix += EnumChatFormatting.DARK_GRAY;
		
		if(eRad < 200)
			radPrefix += EnumChatFormatting.GREEN;
		else if(eRad < 400)
			radPrefix += EnumChatFormatting.YELLOW;
		else if(eRad < 600)
			radPrefix += EnumChatFormatting.GOLD;
		else if(eRad < 800)
			radPrefix += EnumChatFormatting.RED;
		else if(eRad < 1000)
			radPrefix += EnumChatFormatting.DARK_RED;
		else
			radPrefix += EnumChatFormatting.DARK_GRAY;
		
		if(resKoeff > 0)
			resPrefix += EnumChatFormatting.GREEN;

		//localization and server-side restrictions have turned this into a painful mess
		//a *functioning* painful mess, nonetheless
		player.addChatMessage(new ChatComponentText("===== ☢ ").appendSibling(new ChatComponentTranslation("geiger.title")).appendSibling(new ChatComponentText(" ☢ =====")).setChatStyle(new ChatStyle().setColor(EnumChatFormatting.GOLD)));
		player.addChatMessage(new ChatComponentTranslation("geiger.chunkRad").appendSibling(new ChatComponentText(" " + chunkPrefix + rads + " RAD/s")).setChatStyle(new ChatStyle().setColor(EnumChatFormatting.YELLOW)));
		player.addChatMessage(new ChatComponentTranslation("geiger.playerRad").appendSibling(new ChatComponentText(" " + radPrefix + eRad + " RAD")).setChatStyle(new ChatStyle().setColor(EnumChatFormatting.YELLOW)));
		player.addChatMessage(new ChatComponentTranslation("geiger.playerRes").appendSibling(new ChatComponentText(" " + resPrefix + res + "% (" + resKoeff + ")")).setChatStyle(new ChatStyle().setColor(EnumChatFormatting.YELLOW)));
	}
}
