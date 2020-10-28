package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SingleCaseRange extends CaseRule {
  public SingleCaseRange(CaseRule caAST1, SourcePosition thePosition) {
    super(thePosition);
    CA1 = caAST1;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return null;
  }

  public CaseRule CA1;
}
