package ArduinoML.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Mode_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    ListSequence.fromList(SLinkOperations.getChildren(ctx.getPrimaryInput(), MetaAdapterFactory.getContainmentLink(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x140fe9644f06a52cL, 0x140fe9644f06a623L, "transitions"))).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        tgs.append("if (");
        tgs.appendNode(SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x140fe9644f06a535L, 0x140fe9644f06ad21L, "comparison")));
        tgs.append(") {");
        tgs.newLine();
        ctx.getBuffer().area().increaseIndent();
        tgs.indent();
        tgs.append("time = millis();");
        tgs.newLine();
        tgs.indent();
        tgs.append("state_");
        tgs.append(SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x140fe9644f06a535L, 0x140fe9644f06a538L, "nextMode")), MetaAdapterFactory.getReferenceLink(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x140fe9644f06a52cL, 0x140fe9644f11e534L, "initialState")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
        tgs.append("_mode_");
        tgs.append(SPropertyOperations.getString(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x8a1177a2191f4d85L, 0xb39864536e65e675L, 0x140fe9644f06a535L, 0x140fe9644f06a538L, "nextMode")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
        tgs.append("();");
        tgs.newLine();
        ctx.getBuffer().area().decreaseIndent();
        tgs.indent();
        tgs.append("}");
        tgs.newLine();
      }
    });
  }
}
