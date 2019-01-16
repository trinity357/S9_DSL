package ArduinoML.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import java.util.Arrays;

public class EnumerationDescriptor_SIGNAL extends EnumerationDescriptorBase {

  public EnumerationDescriptor_SIGNAL() {
    super(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x36166a13252ed20L, "SIGNAL", "r:b2310a53-b5df-477e-9bab-f808bca79a57(ArduinoML.structure)/243588697374780704", PrimitiveTypeId.STRING);
  }

  private final EnumerationDescriptor.MemberDescriptor VALUE_HIGH_0 = new EnumerationDescriptor.MemberDescriptor("HIGH", "high", "r:b2310a53-b5df-477e-9bab-f808bca79a57(ArduinoML.structure)/243588697374780705", "HIGH");
  private final EnumerationDescriptor.MemberDescriptor VALUE_LOW_0 = new EnumerationDescriptor.MemberDescriptor("LOW", "low", "r:b2310a53-b5df-477e-9bab-f808bca79a57(ArduinoML.structure)/243588697374780706", "LOW");

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return VALUE_HIGH_0;
  }

  @NotNull
  @Override
  public Collection<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return Arrays.asList(VALUE_HIGH_0, VALUE_LOW_0);
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String string) {
    if (string == null) {
      return null;
    }
    switch (string) {
      case "HIGH":
        return VALUE_HIGH_0;
      case "LOW":
        return VALUE_LOW_0;
    }
    return null;
  }
}