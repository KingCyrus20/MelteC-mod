package io.meltec.prima.item

import io.meltec.prima.FlintToolMaterial
import io.meltec.prima.util.PrimaIdentifier
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.SwordItem
import net.minecraft.util.registry.Registry

object PrimaItems {
  val GENERAL_GROUP: ItemGroup = FabricItemGroupBuilder.create(PrimaIdentifier("general")).build()
  val TOOL_GROUP: ItemGroup =
      FabricItemGroupBuilder.create(PrimaIdentifier("tool"))
          .icon { ItemStack(BowDrillItem) }
          .build()
  val COMBAT_GROUP: ItemGroup =
      FabricItemGroupBuilder.create(PrimaIdentifier("combat"))
          .icon { ItemStack(FLINT_SWORD) }
          .build()
  val EQUIPPABLE_GROUP: ItemGroup =
      FabricItemGroupBuilder.create(PrimaIdentifier("equippable"))
          .icon { ItemStack(GliderItem) }
          .build()

  val GliderLeftWingItem = Item(FabricItemSettings().group(GENERAL_GROUP))
  val GliderRightWingItem = Item(FabricItemSettings().group(GENERAL_GROUP))
  val FLINT_SWORD =
      SwordItem(FlintToolMaterial(), 5, 1.6f, FabricItemSettings().group(COMBAT_GROUP))

  fun register() {
    Registry.register(Registry.ITEM, PrimaIdentifier("bow_drill"), BowDrillItem)
    Registry.register(Registry.ITEM, PrimaIdentifier("glider_left_wing"), GliderLeftWingItem)
    Registry.register(Registry.ITEM, PrimaIdentifier("glider_right_wing"), GliderRightWingItem)
    Registry.register(Registry.ITEM, PrimaIdentifier("glider"), GliderItem)
  }
}
