package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public abstract class CaseRule extends AST{

  public CaseRule(SourcePosition thePosition) {
    super(thePosition);
  }
}
