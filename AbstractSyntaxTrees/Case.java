package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class Case extends CaseRule {
  public Case(CaseRule caAST, Command cAST, SourcePosition thePosition) {
    super(thePosition);
    CA = caAST;
    C = cAST;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return null;
  }

  public CaseRule CA;
  public Command C;
}
