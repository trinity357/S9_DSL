package ArduinoML.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenAspectBase;
import ArduinoML.structure.LanguageConceptSwitch;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.text.rt.TextGenDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.text.rt.TextGenModelOutline;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class TextGenAspectDescriptor extends TextGenAspectBase {
  private final LanguageConceptSwitch myIndex = new LanguageConceptSwitch();

  public TextGenAspectDescriptor() {
  }

  @Nullable
  @Override
  public TextGenDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    switch (myIndex.index(concept)) {
      case LanguageConceptSwitch.Actuator:
        return new Actuator_TextGen();
      case LanguageConceptSwitch.App:
        return new App_TextGen();
      case LanguageConceptSwitch.Brick:
        return new Brick_TextGen();
      case LanguageConceptSwitch.LowerThanOperator:
        return new LowerThanOperator_TextGen();
      case LanguageConceptSwitch.Mode:
        return new Mode_TextGen();
      case LanguageConceptSwitch.PlayNote:
        return new PlayNote_TextGen();
      case LanguageConceptSwitch.PlayNoteFromMelody:
        return new PlayNoteFromMelody_TextGen();
      case LanguageConceptSwitch.Sensor:
        return new Sensor_TextGen();
      case LanguageConceptSwitch.SignalOperator:
        return new SignalOperator_TextGen();
      case LanguageConceptSwitch.SimpleAction:
        return new SimpleAction_TextGen();
      case LanguageConceptSwitch.State:
        return new State_TextGen();
      case LanguageConceptSwitch.Transition:
        return new Transition_TextGen();
      case LanguageConceptSwitch.UpperThanOperator:
        return new UpperThanOperator_TextGen();
    }
    return null;
  }

  @Override
  public void breakdownToUnits(@NotNull TextGenModelOutline outline) {
    for (SNode root : outline.getModel().getRootNodes()) {
      if (root.getConcept().equals(MetaAdapterFactory.getConcept(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x36166a13252ed0cL, "ArduinoML.structure.App"))) {
        String fname = getFileName_App(root);
        String ext = getFileExtension_App(root);
        outline.registerTextUnit((ext == null ? fname : (fname + '.' + ext)), root);
        continue;
      }
    }
  }
  private static String getFileName_App(SNode node) {
    return "main";
  }
  private static String getFileExtension_App(SNode node) {
    return "c";
  }
}
