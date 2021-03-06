package tc.oc.tracker.damage.base;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import tc.oc.tracker.base.AbstractDamageInfo;
import tc.oc.tracker.damage.VoidDamageInfo;

public class SimpleVoidDamageInfo extends AbstractDamageInfo implements VoidDamageInfo {

  public SimpleVoidDamageInfo(@Nullable LivingEntity resolvedDamager) {
    super(resolvedDamager);
  }

  @Override
  public
  @Nonnull
  DamageCause getDamageCause() {
    return DamageCause.VOID;
  }
}
