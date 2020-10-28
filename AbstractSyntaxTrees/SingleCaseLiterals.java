package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SingleCaseLiterals extends CaseRule {
  public SingleCaseLiterals(CaseRule cAST, SourcePosition thePosition) {
    super(thePosition);
    C = cAST;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return null;
  }

  public CaseRule C;
}
