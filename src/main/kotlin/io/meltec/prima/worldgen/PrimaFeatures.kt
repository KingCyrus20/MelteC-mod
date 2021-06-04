package io.meltec.prima.worldgen

import io.meltec.prima.util.PrimaIdentifier
import net.minecraft.util.registry.Registry

object PrimaFeatures {
  private val ELLIPSOID_ORE_CLUSTER = EllipsoidOreClusterFeature
  val PERLIN_ORE_CLUSTER = PerlinOreClusterFeature

  fun register() {
    Registry.register(
        Registry.FEATURE, PrimaIdentifier("feature_ellipsoid_ore_cluster"), ELLIPSOID_ORE_CLUSTER)
    Registry.register(
        Registry.FEATURE, PrimaIdentifier("feature_perlin_ore_cluster"), PERLIN_ORE_CLUSTER)
  }
}
