/*
* generated by Xtext
*/
package fr.obeo.releng.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.obeo.releng.services.TargetPlatformGrammarAccess;

public class TargetPlatformParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private TargetPlatformGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.obeo.releng.parser.antlr.internal.InternalTargetPlatformParser createParser(XtextTokenStream stream) {
		return new fr.obeo.releng.parser.antlr.internal.InternalTargetPlatformParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "TargetPlatform";
	}
	
	public TargetPlatformGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TargetPlatformGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
