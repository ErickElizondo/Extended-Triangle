package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class Cases extends CaseRule{
  public Cases(SourcePosition thePosition) {
    super(thePosition);
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return null;
  }
}
