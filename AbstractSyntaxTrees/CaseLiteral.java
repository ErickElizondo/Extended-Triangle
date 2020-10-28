package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class CaseLiteral extends CaseRule {
  public CaseLiteral(Terminal tAST, SourcePosition thePosition) {
    super(thePosition);
    T = tAST;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return null; //cambiar
  }

  public Terminal T;
}
