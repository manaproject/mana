package compiler;
import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class HelloRunner 
{
	public static void main( String[] args) throws Exception 
	{
		ANTLRInputStream input = new ANTLRInputStream( new FileInputStream(new File(args[0])));

		ManaLexer lexer = new ManaLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		ManaParser parser = new ManaParser(tokens);
		ParseTree tree = parser.program();
		System.out.println(tree.toStringTree(parser));
	}
}