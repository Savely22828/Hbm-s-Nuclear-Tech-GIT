//Schematic to java Structure by jajo_11 | inspired by "MITHION'S .SCHEMATIC TO JAVA CONVERTINGTOOL"

package com.hbm.world;

import java.util.Random;

import com.hbm.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class GeyserLarge extends WorldGenerator {

	public boolean generate(World world, Random rand, int x, int y, int z) {
		int i = rand.nextInt(1);

		if (i == 0) {
			generate_r0(world, rand, x, y, z);
		}

		return true;

	}

	public boolean generate_r0(World world, Random rand, int x, int y, int z) {

		x -= 4;
		y -= 10;
		z -= 4;
		world.setBlock(x + 3, y + 5, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 5, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 5, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 5, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 5, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 5, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 5, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 5, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 5, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 5, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 5, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 5, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 5, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 5, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 5, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 5, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 5, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 5, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 5, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 5, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 5, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 6, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 6, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 6, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 6, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 6, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 6, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 6, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 6, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 6, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 6, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 6, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 6, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 6, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 6, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 6, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 6, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 6, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 6, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 6, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 6, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 6, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 6, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 6, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 6, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 6, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 6, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 6, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 6, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 6, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 6, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 6, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 6, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 6, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 6, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 6, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 6, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 6, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 7, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 7, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 7, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 7, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 7, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 7, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 7, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 7, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 7, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 7, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 7, z + 2, Blocks.water, 0, 3);
		world.setBlock(x + 4, y + 7, z + 2, Blocks.water, 0, 3);
		world.setBlock(x + 5, y + 7, z + 2, Blocks.water, 0, 3);
		world.setBlock(x + 6, y + 7, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 7, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 7, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 7, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 7, z + 3, Blocks.water, 0, 3);
		world.setBlock(x + 3, y + 7, z + 3, Blocks.water, 0, 3);
		world.setBlock(x + 4, y + 7, z + 3, Blocks.water, 0, 3);
		world.setBlock(x + 5, y + 7, z + 3, Blocks.water, 0, 3);
		world.setBlock(x + 6, y + 7, z + 3, Blocks.water, 0, 3);
		world.setBlock(x + 7, y + 7, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 7, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 7, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 7, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 7, z + 4, Blocks.water, 0, 3);
		world.setBlock(x + 3, y + 7, z + 4, Blocks.water, 0, 3);
		world.setBlock(x + 4, y + 7, z + 4, Blocks.water, 0, 3);
		world.setBlock(x + 5, y + 7, z + 4, Blocks.water, 0, 3);
		world.setBlock(x + 6, y + 7, z + 4, Blocks.water, 0, 3);
		world.setBlock(x + 7, y + 7, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 7, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 7, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 7, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 7, z + 5, Blocks.water, 0, 3);
		world.setBlock(x + 3, y + 7, z + 5, Blocks.water, 0, 3);
		world.setBlock(x + 4, y + 7, z + 5, Blocks.water, 0, 3);
		world.setBlock(x + 5, y + 7, z + 5, Blocks.water, 0, 3);
		world.setBlock(x + 6, y + 7, z + 5, Blocks.water, 0, 3);
		world.setBlock(x + 7, y + 7, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 7, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 7, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 7, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 7, z + 6, Blocks.water, 0, 3);
		world.setBlock(x + 4, y + 7, z + 6, Blocks.water, 0, 3);
		world.setBlock(x + 5, y + 7, z + 6, Blocks.water, 0, 3);
		world.setBlock(x + 6, y + 7, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 7, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 7, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 7, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 7, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 7, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 7, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 7, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 7, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 7, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 8, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 8, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 8, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 8, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 8, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 8, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 8, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 8, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 8, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 8, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 8, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 8, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 8, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 8, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 8, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 8, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 8, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 8, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 8, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 8, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 8, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 8, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 8, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 8, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 8, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 8, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 8, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 8, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 7, y + 8, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 8, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 8, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 8, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 8, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 8, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 8, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 8, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 8, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 7, y + 8, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 8, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 8, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 8, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 8, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 8, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 8, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 8, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 8, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 7, y + 8, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 8, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 8, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 8, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 8, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 8, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 8, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 8, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 8, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 8, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 8, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 8, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 8, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 8, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 8, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 8, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 8, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 8, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 8, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 8, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 8, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 8, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 8, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 9, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 9, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 9, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 9, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 9, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 9, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 9, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 9, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 9, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 9, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 9, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 9, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 9, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 9, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 9, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 9, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 9, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 9, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 9, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 9, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 9, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 9, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 9, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 9, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 9, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 9, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 9, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 9, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 7, y + 9, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 9, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 9, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 9, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 9, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 9, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 9, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 9, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 9, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 7, y + 9, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 9, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 9, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 9, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 9, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 9, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 9, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 9, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 9, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 7, y + 9, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 9, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 9, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 9, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 9, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 9, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 9, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 9, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 9, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 9, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 9, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 9, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 9, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 9, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 9, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 9, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 9, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 9, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 9, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 9, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 9, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 9, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 9, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 10, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 10, z + 0, Blocks.gravel, 0, 3);
		world.setBlock(x + 4, y + 10, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 10, z + 0, Blocks.gravel, 0, 3);
		world.setBlock(x + 6, y + 10, z + 0, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 10, z + 1, Blocks.gravel, 0, 3);
		world.setBlock(x + 2, y + 10, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 10, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 10, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 10, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 10, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 10, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 10, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 10, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 10, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 10, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 10, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 10, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 10, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 10, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 10, z + 2, Blocks.gravel, 0, 3);
		world.setBlock(x + 0, y + 10, z + 3, Blocks.gravel, 0, 3);
		world.setBlock(x + 1, y + 10, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 10, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 10, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 10, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 10, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 10, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 10, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 10, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 10, z + 4, Blocks.gravel, 0, 3);
		world.setBlock(x + 1, y + 10, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 10, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 10, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 10, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 10, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 10, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 7, y + 10, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 10, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 10, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 10, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 10, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 10, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 10, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 10, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 10, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 10, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 10, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 0, y + 10, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 10, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 10, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 10, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 10, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 10, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 10, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 10, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 8, y + 10, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 10, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 10, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 10, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 10, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 10, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 10, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 10, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 10, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 10, z + 8, Blocks.gravel, 0, 3);
		world.setBlock(x + 4, y + 10, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 10, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 10, z + 8, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 11, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 11, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 11, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 11, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 11, z + 1, Blocks.gravel, 0, 3);
		world.setBlock(x + 1, y + 11, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 11, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 11, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 11, z + 2, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 11, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 11, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 11, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 11, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 11, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 11, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 11, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 11, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 11, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 11, z + 3, Blocks.gravel, 0, 3);
		world.setBlock(x + 1, y + 11, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 11, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 3, y + 11, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 11, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 11, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 11, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 7, y + 11, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 11, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 11, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 11, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 11, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 11, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 11, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 11, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 11, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 11, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 11, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 11, z + 6, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 11, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 11, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 11, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 11, z + 7, Blocks.gravel, 0, 3);
		world.setBlock(x + 3, y + 11, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 11, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 11, z + 7, Blocks.gravel, 0, 3);
		world.setBlock(x + 6, y + 11, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 12, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 12, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 12, z + 1, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 12, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 12, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 12, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 12, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 12, z + 2, Blocks.gravel, 0, 3);
		world.setBlock(x + 1, y + 12, z + 3, Blocks.gravel, 0, 3);
		world.setBlock(x + 2, y + 12, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 12, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 12, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 12, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 12, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 12, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 12, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 12, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 12, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 12, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 12, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 12, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 12, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 12, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 12, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 12, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 12, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 12, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 12, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 12, z + 5, Blocks.gravel, 0, 3);
		world.setBlock(x + 2, y + 12, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 12, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 12, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 12, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 12, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 12, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 12, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 12, z + 7, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 13, z + 1, Blocks.gravel, 0, 3);
		world.setBlock(x + 3, y + 13, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 13, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 13, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 13, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 13, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 13, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 13, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 13, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 1, y + 13, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 13, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 13, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 13, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 13, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 13, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 7, y + 13, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 13, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 13, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 13, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 13, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 13, z + 5, Blocks.gravel, 0, 3);
		world.setBlock(x + 3, y + 13, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 13, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 13, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 13, z + 7, Blocks.gravel, 0, 3);
		world.setBlock(x + 3, y + 14, z + 2, Blocks.gravel, 0, 3);
		world.setBlock(x + 4, y + 14, z + 2, Blocks.gravel, 0, 3);
		world.setBlock(x + 5, y + 14, z + 2, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 14, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 14, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 14, z + 3, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 14, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 14, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 14, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 14, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 4, y + 14, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 14, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 6, y + 14, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 2, y + 14, z + 5, Blocks.gravel, 0, 3);
		world.setBlock(x + 3, y + 14, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 14, z + 5, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 14, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 6, y + 14, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 14, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 14, z + 6, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 14, z + 6, Blocks.gravel, 0, 3);
		world.setBlock(x + 3, y + 15, z + 3, Blocks.gravel, 0, 3);
		world.setBlock(x + 4, y + 15, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 15, z + 3, Blocks.gravel, 0, 3);
		world.setBlock(x + 3, y + 15, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 15, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 15, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 15, z + 5, Blocks.gravel, 0, 3);
		world.setBlock(x + 4, y + 15, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 5, y + 15, z + 5, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 16, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 16, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 16, z + 4, ModBlocks.geysir_water, 0, 3);
		world.setBlock(x + 5, y + 16, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 16, z + 5, Blocks.stone, 0, 3);

		world.setBlock(x + 4, y + 17, z + 3, Blocks.stone, 0, 3);
		world.setBlock(x + 3, y + 17, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 17, z + 4, Blocks.air, 0, 3);
		world.setBlock(x + 5, y + 17, z + 4, Blocks.stone, 0, 3);
		world.setBlock(x + 4, y + 17, z + 5, Blocks.stone, 0, 3);

		return true;

	}
}
