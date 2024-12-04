package main.java;


import main.java.enums.TokenType;

/**
 * @author Mohit Joshi
 * @date 04-12-2024
 */
public class Token {
  final TokenType type;
  final String lexeme;
  final Object literal;
  final int line;
  Token(TokenType type, String lexeme, Object literal, int line) {
    this.type = type;
    this.lexeme = lexeme;
    this.literal = literal;
    this.line = line;
  }
  public String toString() {
    return type + " " + lexeme + " " + literal;
  }
}
