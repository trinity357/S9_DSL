package ArduinoML.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.scope.EmptyScope;
import jetbrains.mps.smodel.SNodePointer;

public class Mode_Constraints extends BaseConstraintsDescriptor {
  public Mode_Constraints() {
    super(MetaAdapterFactory.getConcept(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x140fe9644f06a52cL, "ArduinoML.structure.Mode"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x140fe9644f06a52cL, 0x140fe9644f11e534L, "initialState"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x140fe9644f06a52cL, 0x140fe9644f11e534L), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_9javh_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            Scope scope = Scope.getScope(_context.getContextNode(), _context.getContainmentLink(), _context.getPosition(), MetaAdapterFactory.getConcept(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x36166a13252ed1bL, "ArduinoML.structure.State"));
            return (scope == null ? new EmptyScope() : scope);
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_9javh_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:6173561a-742f-46f0-99c0-4b4dcbe72334(ArduinoML.constraints)", "259496194769694248");
}
