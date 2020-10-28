package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ElseCase extends CaseRule {

  public ElseCase(Command cAST, SourcePosition thePosition) {
    super(thePosition);
    C = cAST;
  }

  @Override
  public Object visit(Visitor v, Object o) {
    return null;
  }

  public Command C;
}
