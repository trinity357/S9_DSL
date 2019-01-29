package ArduinoML.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_MelodyNote_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_MelodyNote_NonTypesystemRule() {
  }
  public void applyRule(final SNode melodyNote, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SPropertyOperations.getInteger(melodyNote, MetaAdapterFactory.getProperty(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x6bc7b3d27b5df127L, 0x7cd55a217c3f9fe9L, "octave")) < 0 || SPropertyOperations.getInteger(melodyNote, MetaAdapterFactory.getProperty(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x6bc7b3d27b5df127L, 0x7cd55a217c3f9fe9L, "octave")) > 7) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(melodyNote, "The octave must be between 0 and 7", "r:86136e03-8a7b-41ce-9bbb-e90666fa6e2f(ArduinoML.typesystem)", "8995194930609145471", null, errorTarget);
      }
    }
    if (SPropertyOperations.getInteger(melodyNote, MetaAdapterFactory.getProperty(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x6bc7b3d27b5df127L, 0x6bc7b3d27bcf7fadL, "duration")) < 0) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(melodyNote, "The duration must be > 0 but is " + SPropertyOperations.getInteger(melodyNote, MetaAdapterFactory.getProperty(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x6bc7b3d27b5df127L, 0x6bc7b3d27bcf7fadL, "duration")), "r:86136e03-8a7b-41ce-9bbb-e90666fa6e2f(ArduinoML.typesystem)", "8995194930612979134", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x6bc7b3d27b5df127L, "ArduinoML.structure.MelodyNote");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
