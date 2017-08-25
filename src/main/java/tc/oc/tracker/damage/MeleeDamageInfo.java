package tc.oc.tracker.damage;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import tc.oc.tracker.DamageInfo;

/**
 * Represents damage inflicted by hand-to-hand combat between entities.
 */
public interface MeleeDamageInfo extends DamageInfo {

  /**
   * Gets the entity that directly attacked the victim.
   *
   * Note: this returns the same as {@link getResolvedDamager()}.
   *
   * @return Entity who attacked
   */
  @Nonnull
  LivingEntity getAttacker();

  /**
   * Gets the material of the weapon that the assailant used.
   *
   * Note: fist kills will return {@link Material.AIR}.
   *
   * @return Material of weapon used
   */
  @Nonnull
  Material getWeapon();

  /**
   * Gets the item stack of the weapon that the assailant used.
   *
   * Note: fist kills will return null.
   *
   * @return Stack of weapon used
   */
  @Nullable
  ItemStack getWeaponStack();
}
