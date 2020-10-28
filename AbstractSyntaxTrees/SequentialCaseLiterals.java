package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SequentialCaseLiterals extends CaseRule {
  public SequentialCaseLiterals(CaseRule caAST1, CaseRule caAST2, SourcePosition thePosition) {
    super(thePosition);
    CA1 = caAST1;
    CA2 = caAST2;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return null;
  }

  public CaseRule CA1;
  public CaseRule CA2;
}
