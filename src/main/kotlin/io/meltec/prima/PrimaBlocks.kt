package io.meltec.prima

import io.meltec.prima.util.PrimaIdentifier
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemGroup
import net.minecraft.util.registry.Registry

object PrimaBlocks {
  val COPPER_ORE = createOre(1)
  val TIN_ORE = createOre(1)
  private val CHALCOCITE_ORE = createOre(1)
  val ZINC_ORE = createOre(1)

  private val GALENA_ORE = createOre(1)
  private val BISMUTHINITE_ORE = createOre(1)
  private val ORPIMENT_ORE = createOre(2)
  private val STIBNITE_ORE = createOre(2)
  private val BORAX_ORE = createOre(2)
  private val MAGNESITE_ORE = createOre(3)
  private val APATITE_ORE = createOre(3)
  private val HEMATITE_ORE = createOre(2)
  private val MAGNETITE_ORE = createOre(2)
  private val GOLD_ORE = createOre(1)
  private val CINNABAR_ORE = createOre(3)
  private val SILVER_ORE = createOre(1)
  private val SALTPETER_ORE = createOre(2)
  private val ROCK_SALT_ORE = createOre(1)
  private val CORUNDUM_ORE = createOre(3)
  private val BAUXITE_ORE = createOre(2)
  private val ACANTHITE_ORE = createOre(2)
  private val PYRITE_ORE = createOre(2)
  private val CHALCOPYRITE_ORE = createOre(2)
  private val ANTHRACITE_ORE = createOre(2)
  private val BITUMINOUS_COAL_ORE = createOre(1)
  private val LIGNITE_ORE = createOre(1)

  fun register() {
    registerBlock("dev_cube", Block(FabricBlockSettings.of(Material.STONE)))
    registerBlock("copper_ore", COPPER_ORE)
    registerBlock("tin_ore", TIN_ORE)
    registerBlock("chalcocite_ore", CHALCOCITE_ORE)
    registerBlock("zinc_ore", ZINC_ORE)
    registerBlock("galena_ore", GALENA_ORE)
    registerBlock("bismuthinite_ore", BISMUTHINITE_ORE)
    registerBlock("orpiment_ore", ORPIMENT_ORE)
    registerBlock("stibnite_ore", STIBNITE_ORE)
    registerBlock("borax_ore", BORAX_ORE)
    registerBlock("magnesite_ore", MAGNESITE_ORE)
    registerBlock("apatite_ore", APATITE_ORE)
    registerBlock("hematite_ore", HEMATITE_ORE)
    registerBlock("magnetite_ore", MAGNETITE_ORE)
    registerBlock("gold_ore", GOLD_ORE)
    registerBlock("cinnabar_ore", CINNABAR_ORE)
    registerBlock("silver_ore", SILVER_ORE)
    registerBlock("saltpeter_ore", SALTPETER_ORE)
    registerBlock("rock_salt_ore", ROCK_SALT_ORE)
    registerBlock("corundum_ore", CORUNDUM_ORE)
    registerBlock("bauxite_ore", BAUXITE_ORE)
    registerBlock("acanthite_ore", ACANTHITE_ORE)
    registerBlock("pyrite_ore", PYRITE_ORE)
    registerBlock("chalcopyrite_ore", CHALCOPYRITE_ORE)
    registerBlock("anthracite_ore", ANTHRACITE_ORE)
    registerBlock("bituminous_coal_ore", BITUMINOUS_COAL_ORE)
    registerBlock("lignite_ore", LIGNITE_ORE)
  }

  private fun createOre(miningLevel: Int): Block {
    return Block(
        FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .strength(3.0f)
            .breakByTool(FabricToolTags.PICKAXES, miningLevel))
  }

  private fun registerBlock(identifier: String, oreBlock: Block) {
    Registry.register(Registry.BLOCK, PrimaIdentifier(identifier), oreBlock)
    Registry.register(
        Registry.ITEM,
        PrimaIdentifier(identifier),
        BlockItem(oreBlock, FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)))
  }
}
