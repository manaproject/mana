package compiler;
// Generated from Mana.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ManaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__82=1, T__81=2, T__80=3, T__79=4, T__78=5, T__77=6, T__76=7, T__75=8, 
		T__74=9, T__73=10, T__72=11, T__71=12, T__70=13, T__69=14, T__68=15, T__67=16, 
		T__66=17, T__65=18, T__64=19, T__63=20, T__62=21, T__61=22, T__60=23, 
		T__59=24, T__58=25, T__57=26, T__56=27, T__55=28, T__54=29, T__53=30, 
		T__52=31, T__51=32, T__50=33, T__49=34, T__48=35, T__47=36, T__46=37, 
		T__45=38, T__44=39, T__43=40, T__42=41, T__41=42, T__40=43, T__39=44, 
		T__38=45, T__37=46, T__36=47, T__35=48, T__34=49, T__33=50, T__32=51, 
		T__31=52, T__30=53, T__29=54, T__28=55, T__27=56, T__26=57, T__25=58, 
		T__24=59, T__23=60, T__22=61, T__21=62, T__20=63, T__19=64, T__18=65, 
		T__17=66, T__16=67, T__15=68, T__14=69, T__13=70, T__12=71, T__11=72, 
		T__10=73, T__9=74, T__8=75, T__7=76, T__6=77, T__5=78, T__4=79, T__3=80, 
		T__2=81, T__1=82, T__0=83, ID=84, BOOLEAN=85, DECIMAL_LITERAL=86, HEX_LITERAL=87, 
		OCT_LITERAL=88, BINARY_LITERAL=89, FLOAT_LITERAL=90, HEX_FLOAT_LITERAL=91, 
		CHAR_LITERAL=92, STRING_LITERAL=93, OVERRIDABLE_OP=94, WS=95, COMMENT=96, 
		LINE_COMMENT=97;
	public static final String[] tokenNames = {
		"<INVALID>", "'f64'", "'f32'", "'+='", "'%='", "'interface'", "'char'", 
		"'foreach'", "'!='", "'while'", "'{'", "'>>'", "'&&'", "'^='", "'byte'", 
		"'='", "'^'", "'<<='", "'for'", "'u16'", "'|='", "'('", "'-='", "'repeat'", 
		"','", "'u32'", "'/='", "'u64'", "'mut'", "'>='", "'++'", "'skip'", "'<'", 
		"']'", "'~'", "'@'", "'type'", "'fn'", "'let'", "'static'", "'match'", 
		"'sizeof'", "'+'", "'module'", "'/'", "'*='", "'as'", "'&='", "'return'", 
		"'class'", "'||'", "'>>='", "';'", "'<<'", "'}'", "'if'", "'enum'", "'<='", 
		"'break'", "'local'", "'&'", "'is'", "'*'", "'.'", "'->'", "'i16'", "':'", 
		"'['", "'--'", "'=='", "'|'", "'i64'", "'i32'", "'bool'", "'>'", "'u8'", 
		"'!'", "'%'", "'else'", "'in'", "')'", "'i8'", "'-'", "'import'", "ID", 
		"BOOLEAN", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", 
		"FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"OVERRIDABLE_OP", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_import_block = 1, RULE_import_statements = 2, RULE_import_statement = 3, 
		RULE_import_sequence = 4, RULE_import_sequence_list = 5, RULE_declarations = 6, 
		RULE_module_decl = 7, RULE_fn_param_list = 8, RULE_fn_param = 9, RULE_type_ = 10, 
		RULE_namespace_list = 11, RULE_type_list = 12, RULE_basic_type = 13, RULE_type_decl = 14, 
		RULE_enum_decl = 15, RULE_enum_list = 16, RULE_enum_elt = 17, RULE_typedef_decl = 18, 
		RULE_class_decl = 19, RULE_class_extends = 20, RULE_class_definition = 21, 
		RULE_class_method = 22, RULE_class_operator = 23, RULE_static_method = 24, 
		RULE_class_attribute = 25, RULE_static_class_attribute = 26, RULE_interface_decl = 27, 
		RULE_interface_definition = 28, RULE_interface_method = 29, RULE_interface_operator = 30, 
		RULE_class_or_interface_type = 31, RULE_fn_header = 32, RULE_op_header = 33, 
		RULE_fn_decl = 34, RULE_op_decl = 35, RULE_var_decl = 36, RULE_block = 37, 
		RULE_statement = 38, RULE_repeat_stmt = 39, RULE_while_stmt = 40, RULE_for_stmt = 41, 
		RULE_foreach_stmt = 42, RULE_return_stmt = 43, RULE_break_stmt = 44, RULE_skip_stmt = 45, 
		RULE_if_stmt = 46, RULE_match_stmt = 47, RULE_match_elt = 48, RULE_match_else = 49, 
		RULE_annotations = 50, RULE_annotation = 51, RULE_templates = 52, RULE_params = 53, 
		RULE_param = 54, RULE_optional_params = 55, RULE_optional_param = 56, 
		RULE_expression_list = 57, RULE_expression = 58, RULE_op_assign = 59, 
		RULE_op_or = 60, RULE_op_and = 61, RULE_op_bin_or = 62, RULE_op_bin_xor = 63, 
		RULE_op_bin_and = 64, RULE_op_eq = 65, RULE_op_compare = 66, RULE_op_shift = 67, 
		RULE_op_add = 68, RULE_op_mult = 69, RULE_op_unary = 70, RULE_op_pointer = 71, 
		RULE_fn_params_expressions = 72, RULE_fn_param_expression = 73, RULE_id_list = 74, 
		RULE_namespace = 75, RULE_value = 76, RULE_lambda_expression = 77, RULE_array_comprehension = 78, 
		RULE_obj_fields = 79;
	public static final String[] ruleNames = {
		"program", "import_block", "import_statements", "import_statement", "import_sequence", 
		"import_sequence_list", "declarations", "module_decl", "fn_param_list", 
		"fn_param", "type_", "namespace_list", "type_list", "basic_type", "type_decl", 
		"enum_decl", "enum_list", "enum_elt", "typedef_decl", "class_decl", "class_extends", 
		"class_definition", "class_method", "class_operator", "static_method", 
		"class_attribute", "static_class_attribute", "interface_decl", "interface_definition", 
		"interface_method", "interface_operator", "class_or_interface_type", "fn_header", 
		"op_header", "fn_decl", "op_decl", "var_decl", "block", "statement", "repeat_stmt", 
		"while_stmt", "for_stmt", "foreach_stmt", "return_stmt", "break_stmt", 
		"skip_stmt", "if_stmt", "match_stmt", "match_elt", "match_else", "annotations", 
		"annotation", "templates", "params", "param", "optional_params", "optional_param", 
		"expression_list", "expression", "op_assign", "op_or", "op_and", "op_bin_or", 
		"op_bin_xor", "op_bin_and", "op_eq", "op_compare", "op_shift", "op_add", 
		"op_mult", "op_unary", "op_pointer", "fn_params_expressions", "fn_param_expression", 
		"id_list", "namespace", "value", "lambda_expression", "array_comprehension", 
		"obj_fields"
	};

	@Override
	public String getGrammarFileName() { return "Mana.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ManaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Import_blockContext import_block() {
			return getRuleContext(Import_blockContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(160); import_block();
				}
			}

			setState(164);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__78) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__34) | (1L << T__27) | (1L << T__24))) != 0)) {
				{
				setState(163); declarations();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_blockContext extends ParserRuleContext {
		public Import_statementsContext import_statements() {
			return getRuleContext(Import_statementsContext.class,0);
		}
		public Import_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterImport_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitImport_block(this);
		}
	}

	public final Import_blockContext import_block() throws RecognitionException {
		Import_blockContext _localctx = new Import_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(T__0);
			setState(167); match(T__62);
			setState(169);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(168); import_statements();
				}
			}

			setState(171); match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_statementsContext extends ParserRuleContext {
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public Import_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterImport_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitImport_statements(this);
		}
	}

	public final Import_statementsContext import_statements() throws RecognitionException {
		Import_statementsContext _localctx = new Import_statementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173); import_statement();
					setState(174); match(T__59);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(181); import_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_statementContext extends ParserRuleContext {
		public Import_sequence_listContext import_sequence_list() {
			return getRuleContext(Import_sequence_listContext.class,0);
		}
		public Import_sequenceContext import_sequence() {
			return getRuleContext(Import_sequenceContext.class,0);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitImport_statement(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); import_sequence();
			setState(188);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(184); match(T__73);
				setState(185); import_sequence_list();
				setState(186); match(T__29);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_sequenceContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ManaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ManaParser.ID, i);
		}
		public Import_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterImport_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitImport_sequence(this);
		}
	}

	public final Import_sequenceContext import_sequence() throws RecognitionException {
		Import_sequenceContext _localctx = new Import_sequenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_sequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190); match(ID);
					setState(191); match(T__20);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(197); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_sequence_listContext extends ParserRuleContext {
		public Import_sequenceContext import_sequence(int i) {
			return getRuleContext(Import_sequenceContext.class,i);
		}
		public List<Import_sequenceContext> import_sequence() {
			return getRuleContexts(Import_sequenceContext.class);
		}
		public Import_sequence_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_sequence_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterImport_sequence_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitImport_sequence_list(this);
		}
	}

	public final Import_sequence_listContext import_sequence_list() throws RecognitionException {
		Import_sequence_listContext _localctx = new Import_sequence_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_sequence_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199); import_sequence();
					setState(200); match(T__59);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(207); import_sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<Fn_declContext> fn_decl() {
			return getRuleContexts(Fn_declContext.class);
		}
		public Fn_declContext fn_decl(int i) {
			return getRuleContext(Fn_declContext.class,i);
		}
		public Type_declContext type_decl(int i) {
			return getRuleContext(Type_declContext.class,i);
		}
		public Module_declContext module_decl(int i) {
			return getRuleContext(Module_declContext.class,i);
		}
		public List<Type_declContext> type_decl() {
			return getRuleContexts(Type_declContext.class);
		}
		public List<Module_declContext> module_decl() {
			return getRuleContexts(Module_declContext.class);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(212);
				switch (_input.LA(1)) {
				case T__40:
					{
					setState(209); module_decl();
					}
					break;
				case T__46:
					{
					setState(210); fn_decl();
					}
					break;
				case T__78:
				case T__47:
				case T__34:
				case T__27:
				case T__24:
					{
					setState(211); type_decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__78) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__34) | (1L << T__27) | (1L << T__24))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public List<Fn_declContext> fn_decl() {
			return getRuleContexts(Fn_declContext.class);
		}
		public Fn_declContext fn_decl(int i) {
			return getRuleContext(Fn_declContext.class,i);
		}
		public Type_declContext type_decl(int i) {
			return getRuleContext(Type_declContext.class,i);
		}
		public Module_declContext module_decl(int i) {
			return getRuleContext(Module_declContext.class,i);
		}
		public List<Type_declContext> type_decl() {
			return getRuleContexts(Type_declContext.class);
		}
		public List<Module_declContext> module_decl() {
			return getRuleContexts(Module_declContext.class);
		}
		public Module_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterModule_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitModule_decl(this);
		}
	}

	public final Module_declContext module_decl() throws RecognitionException {
		Module_declContext _localctx = new Module_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_module_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(T__40);
			setState(217); match(ID);
			setState(218); match(T__73);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__78) | (1L << T__47) | (1L << T__46) | (1L << T__40) | (1L << T__34) | (1L << T__27) | (1L << T__24))) != 0)) {
				{
				setState(222);
				switch (_input.LA(1)) {
				case T__40:
					{
					setState(219); module_decl();
					}
					break;
				case T__46:
					{
					setState(220); fn_decl();
					}
					break;
				case T__78:
				case T__47:
				case T__34:
				case T__27:
				case T__24:
					{
					setState(221); type_decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_param_listContext extends ParserRuleContext {
		public List<Fn_paramContext> fn_param() {
			return getRuleContexts(Fn_paramContext.class);
		}
		public Fn_paramContext fn_param(int i) {
			return getRuleContext(Fn_paramContext.class,i);
		}
		public Fn_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterFn_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitFn_param_list(this);
		}
	}

	public final Fn_param_listContext fn_param_list() throws RecognitionException {
		Fn_param_listContext _localctx = new Fn_param_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fn_param_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229); fn_param();
					setState(230); match(T__59);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(237); fn_param();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_paramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Fn_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterFn_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitFn_param(this);
		}
	}

	public final Fn_paramContext fn_param() throws RecognitionException {
		Fn_paramContext _localctx = new Fn_paramContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fn_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(239); match(T__55);
				}
			}

			setState(242); match(ID);
			setState(243); match(T__17);
			setState(244); type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Namespace_listContext namespace_list() {
			return getRuleContext(Namespace_listContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitType_(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		return type_(0);
	}

	private Type_Context type_(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_Context _localctx = new Type_Context(_ctx, _parentState);
		Type_Context _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_type_, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(247); namespace();
				setState(252);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(248); match(T__51);
					setState(249); type_list();
					setState(250); match(T__9);
					}
					break;
				}
				}
				break;
			case T__82:
			case T__81:
			case T__77:
			case T__69:
			case T__64:
			case T__58:
			case T__56:
			case T__18:
			case T__12:
			case T__11:
			case T__10:
			case T__8:
			case T__2:
				{
				setState(254); basic_type();
				}
				break;
			case T__73:
				{
				setState(255); match(T__73);
				setState(256); namespace_list();
				setState(257); match(T__29);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_);
					setState(261);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(262); match(T__16);
					setState(263); match(T__50);
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Namespace_listContext extends ParserRuleContext {
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public Namespace_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterNamespace_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitNamespace_list(this);
		}
	}

	public final Namespace_listContext namespace_list() throws RecognitionException {
		Namespace_listContext _localctx = new Namespace_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_namespace_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269); namespace();
					setState(270); match(T__59);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(277); namespace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_listContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public Type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterType_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitType_list(this);
		}
	}

	public final Type_listContext type_list() throws RecognitionException {
		Type_listContext _localctx = new Type_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279); type_(0);
					setState(280); match(T__59);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(287); type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_typeContext extends ParserRuleContext {
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitBasic_type(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__82) | (1L << T__81) | (1L << T__77) | (1L << T__69) | (1L << T__64) | (1L << T__58) | (1L << T__56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__18 - 65)) | (1L << (T__12 - 65)) | (1L << (T__11 - 65)) | (1L << (T__10 - 65)) | (1L << (T__8 - 65)) | (1L << (T__2 - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declContext extends ParserRuleContext {
		public Interface_declContext interface_decl() {
			return getRuleContext(Interface_declContext.class,0);
		}
		public Enum_declContext enum_decl() {
			return getRuleContext(Enum_declContext.class,0);
		}
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public Typedef_declContext typedef_decl() {
			return getRuleContext(Typedef_declContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitType_decl(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_decl);
		try {
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); class_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); interface_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293); enum_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294); typedef_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declContext extends ParserRuleContext {
		public Enum_listContext enum_list() {
			return getRuleContext(Enum_listContext.class,0);
		}
		public Enum_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterEnum_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitEnum_decl(this);
		}
	}

	public final Enum_declContext enum_decl() throws RecognitionException {
		Enum_declContext _localctx = new Enum_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enum_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(297); match(T__24);
				}
			}

			setState(300); match(T__27);
			setState(301); match(T__73);
			setState(302); enum_list();
			setState(303); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_listContext extends ParserRuleContext {
		public Enum_eltContext enum_elt(int i) {
			return getRuleContext(Enum_eltContext.class,i);
		}
		public List<Enum_eltContext> enum_elt() {
			return getRuleContexts(Enum_eltContext.class);
		}
		public Enum_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterEnum_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitEnum_list(this);
		}
	}

	public final Enum_listContext enum_list() throws RecognitionException {
		Enum_listContext _localctx = new Enum_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enum_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(305); enum_elt();
			setState(306); match(T__59);
			}
			setState(308); enum_elt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_eltContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public Enum_eltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_elt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterEnum_elt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitEnum_elt(this);
		}
	}

	public final Enum_eltContext enum_elt() throws RecognitionException {
		Enum_eltContext _localctx = new Enum_eltContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enum_elt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typedef_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Typedef_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterTypedef_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitTypedef_decl(this);
		}
	}

	public final Typedef_declContext typedef_decl() throws RecognitionException {
		Typedef_declContext _localctx = new Typedef_declContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typedef_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(312); match(T__24);
				}
			}

			setState(315); match(T__47);
			setState(316); match(ID);
			setState(317); match(T__68);
			setState(318); type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public TemplatesContext templates() {
			return getRuleContext(TemplatesContext.class,0);
		}
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Class_extendsContext class_extends() {
			return getRuleContext(Class_extendsContext.class,0);
		}
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterClass_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitClass_decl(this);
		}
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_class_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(T__34);
			setState(321); match(ID);
			setState(323);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(322); templates();
				}
			}

			setState(326);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(325); class_extends();
				}
			}

			setState(328); match(T__73);
			setState(329); class_definition();
			setState(330); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_extendsContext extends ParserRuleContext {
		public Class_or_interface_typeContext class_or_interface_type() {
			return getRuleContext(Class_or_interface_typeContext.class,0);
		}
		public Class_extendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_extends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterClass_extends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitClass_extends(this);
		}
	}

	public final Class_extendsContext class_extends() throws RecognitionException {
		Class_extendsContext _localctx = new Class_extendsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_class_extends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(T__17);
			setState(333); class_or_interface_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_definitionContext extends ParserRuleContext {
		public List<Class_methodContext> class_method() {
			return getRuleContexts(Class_methodContext.class);
		}
		public Static_methodContext static_method(int i) {
			return getRuleContext(Static_methodContext.class,i);
		}
		public List<Static_methodContext> static_method() {
			return getRuleContexts(Static_methodContext.class);
		}
		public Static_class_attributeContext static_class_attribute(int i) {
			return getRuleContext(Static_class_attributeContext.class,i);
		}
		public List<Static_class_attributeContext> static_class_attribute() {
			return getRuleContexts(Static_class_attributeContext.class);
		}
		public Class_operatorContext class_operator(int i) {
			return getRuleContext(Class_operatorContext.class,i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Class_methodContext class_method(int i) {
			return getRuleContext(Class_methodContext.class,i);
		}
		public List<Class_attributeContext> class_attribute() {
			return getRuleContexts(Class_attributeContext.class);
		}
		public List<Class_operatorContext> class_operator() {
			return getRuleContexts(Class_operatorContext.class);
		}
		public Class_attributeContext class_attribute(int i) {
			return getRuleContext(Class_attributeContext.class,i);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitClass_definition(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(335); annotations();
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__24))) != 0)) {
				{
				setState(343);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(338); class_method();
					}
					break;
				case 2:
					{
					setState(339); class_attribute();
					}
					break;
				case 3:
					{
					setState(340); static_method();
					}
					break;
				case 4:
					{
					setState(341); static_class_attribute();
					}
					break;
				case 5:
					{
					setState(342); class_operator();
					}
					break;
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_methodContext extends ParserRuleContext {
		public Fn_declContext fn_decl() {
			return getRuleContext(Fn_declContext.class,0);
		}
		public Class_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterClass_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitClass_method(this);
		}
	}

	public final Class_methodContext class_method() throws RecognitionException {
		Class_methodContext _localctx = new Class_methodContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_class_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(348); match(T__24);
				}
			}

			setState(351); fn_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_operatorContext extends ParserRuleContext {
		public Op_declContext op_decl() {
			return getRuleContext(Op_declContext.class,0);
		}
		public Class_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterClass_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitClass_operator(this);
		}
	}

	public final Class_operatorContext class_operator() throws RecognitionException {
		Class_operatorContext _localctx = new Class_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_class_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(353); match(T__24);
				}
			}

			setState(356); op_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_methodContext extends ParserRuleContext {
		public Class_methodContext class_method() {
			return getRuleContext(Class_methodContext.class,0);
		}
		public Static_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterStatic_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitStatic_method(this);
		}
	}

	public final Static_methodContext static_method() throws RecognitionException {
		Static_methodContext _localctx = new Static_methodContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_static_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); match(T__44);
			setState(359); class_method();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_attributeContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Class_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterClass_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitClass_attribute(this);
		}
	}

	public final Class_attributeContext class_attribute() throws RecognitionException {
		Class_attributeContext _localctx = new Class_attributeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_class_attribute);
		int _la;
		try {
			setState(393);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361); match(T__45);
				setState(363);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(362); match(T__24);
					}
				}

				setState(366);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(365); match(T__55);
					}
				}

				setState(368); id_list();
				setState(371);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(369); match(T__17);
					setState(370); type_(0);
					}
				}

				{
				setState(373); match(T__68);
				setState(374); expression_list();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); match(T__45);
				setState(378);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(377); match(T__24);
					}
				}

				setState(381);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(380); match(T__55);
					}
				}

				setState(383); match(T__62);
				setState(384); id_list();
				setState(385); match(T__3);
				setState(388);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(386); match(T__17);
					setState(387); type_(0);
					}
				}

				{
				setState(390); match(T__68);
				setState(391); expression_list();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_class_attributeContext extends ParserRuleContext {
		public Class_attributeContext class_attribute() {
			return getRuleContext(Class_attributeContext.class,0);
		}
		public Static_class_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_class_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterStatic_class_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitStatic_class_attribute(this);
		}
	}

	public final Static_class_attributeContext static_class_attribute() throws RecognitionException {
		Static_class_attributeContext _localctx = new Static_class_attributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_static_class_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(395); match(T__24);
				}
			}

			setState(398); class_attribute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public TemplatesContext templates() {
			return getRuleContext(TemplatesContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Class_extendsContext class_extends() {
			return getRuleContext(Class_extendsContext.class,0);
		}
		public Interface_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterInterface_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitInterface_decl(this);
		}
	}

	public final Interface_declContext interface_decl() throws RecognitionException {
		Interface_declContext _localctx = new Interface_declContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interface_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); match(T__78);
			setState(401); match(ID);
			setState(403);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(402); templates();
				}
			}

			setState(406);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(405); class_extends();
				}
			}

			setState(408); match(T__73);
			setState(409); interface_definition();
			setState(410); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_definitionContext extends ParserRuleContext {
		public Interface_operatorContext interface_operator(int i) {
			return getRuleContext(Interface_operatorContext.class,i);
		}
		public List<Interface_methodContext> interface_method() {
			return getRuleContexts(Interface_methodContext.class);
		}
		public Interface_methodContext interface_method(int i) {
			return getRuleContext(Interface_methodContext.class,i);
		}
		public List<Interface_operatorContext> interface_operator() {
			return getRuleContexts(Interface_operatorContext.class);
		}
		public Interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterInterface_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitInterface_definition(this);
		}
	}

	public final Interface_definitionContext interface_definition() throws RecognitionException {
		Interface_definitionContext _localctx = new Interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(414);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(412); interface_method();
					}
					break;
				case 2:
					{
					setState(413); interface_operator();
					}
					break;
				}
				}
				setState(416); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__46 || _la==T__24 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_methodContext extends ParserRuleContext {
		public Fn_headerContext fn_header() {
			return getRuleContext(Fn_headerContext.class,0);
		}
		public Interface_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterInterface_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitInterface_method(this);
		}
	}

	public final Interface_methodContext interface_method() throws RecognitionException {
		Interface_methodContext _localctx = new Interface_methodContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interface_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(418); match(T__24);
				}
			}

			setState(421); fn_header();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_operatorContext extends ParserRuleContext {
		public Op_headerContext op_header() {
			return getRuleContext(Op_headerContext.class,0);
		}
		public Interface_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterInterface_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitInterface_operator(this);
		}
	}

	public final Interface_operatorContext interface_operator() throws RecognitionException {
		Interface_operatorContext _localctx = new Interface_operatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interface_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(423); match(T__24);
				}
			}

			setState(426); op_header();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_or_interface_typeContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Class_or_interface_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_or_interface_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterClass_or_interface_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitClass_or_interface_type(this);
		}
	}

	public final Class_or_interface_typeContext class_or_interface_type() throws RecognitionException {
		Class_or_interface_typeContext _localctx = new Class_or_interface_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_class_or_interface_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); namespace();
			setState(433);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(429); match(T__51);
				setState(430); type_list();
				setState(431); match(T__9);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_headerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Optional_paramsContext optional_params() {
			return getRuleContext(Optional_paramsContext.class,0);
		}
		public Fn_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterFn_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitFn_header(this);
		}
	}

	public final Fn_headerContext fn_header() throws RecognitionException {
		Fn_headerContext _localctx = new Fn_headerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fn_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(T__46);
			setState(436); match(ID);
			setState(437); match(T__62);
			setState(439);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(438); params();
				}
				break;
			}
			setState(442);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(441); optional_params();
				}
			}

			setState(444); match(T__3);
			{
			setState(445); match(T__19);
			setState(446); type_(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_headerContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Optional_paramsContext optional_params() {
			return getRuleContext(Optional_paramsContext.class,0);
		}
		public TerminalNode OVERRIDABLE_OP() { return getToken(ManaParser.OVERRIDABLE_OP, 0); }
		public Op_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_header(this);
		}
	}

	public final Op_headerContext op_header() throws RecognitionException {
		Op_headerContext _localctx = new Op_headerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); match(T__46);
			setState(449); match(OVERRIDABLE_OP);
			setState(450); match(T__62);
			setState(452);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(451); params();
				}
				break;
			}
			setState(455);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(454); optional_params();
				}
			}

			setState(457); match(T__3);
			{
			setState(458); match(T__19);
			setState(459); type_(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_declContext extends ParserRuleContext {
		public Fn_headerContext fn_header() {
			return getRuleContext(Fn_headerContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Fn_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterFn_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitFn_decl(this);
		}
	}

	public final Fn_declContext fn_decl() throws RecognitionException {
		Fn_declContext _localctx = new Fn_declContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fn_decl);
		try {
			setState(468);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461); fn_header();
				setState(462); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464); fn_header();
				setState(465); match(T__68);
				setState(466); expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_declContext extends ParserRuleContext {
		public Op_headerContext op_header() {
			return getRuleContext(Op_headerContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Op_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_decl(this);
		}
	}

	public final Op_declContext op_decl() throws RecognitionException {
		Op_declContext _localctx = new Op_declContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_decl);
		try {
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470); op_header();
				setState(471); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473); op_header();
				setState(474); match(T__68);
				setState(475); expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); match(T__45);
			setState(481);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(480); match(T__55);
				}
			}

			setState(483); id_list();
			setState(486);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(484); match(T__17);
				setState(485); type_(0);
				}
			}

			{
			setState(488); match(T__68);
			setState(489); expression_list();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491); match(T__73);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__76) | (1L << T__74) | (1L << T__73) | (1L << T__65) | (1L << T__60) | (1L << T__53) | (1L << T__52) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__43) | (1L << T__42) | (1L << T__41) | (1L << T__35) | (1L << T__28) | (1L << T__25))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__7 - 67)) | (1L << (T__1 - 67)) | (1L << (ID - 67)) | (1L << (BOOLEAN - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (OVERRIDABLE_OP - 67)))) != 0)) {
				{
				{
				setState(492); statement();
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Repeat_stmtContext repeat_stmt() {
			return getRuleContext(Repeat_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Skip_stmtContext skip_stmt() {
			return getRuleContext(Skip_stmtContext.class,0);
		}
		public Foreach_stmtContext foreach_stmt() {
			return getRuleContext(Foreach_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Match_stmtContext match_stmt() {
			return getRuleContext(Match_stmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(500); block();
				}
				break;
			case 2:
				{
				setState(501); var_decl();
				}
				break;
			case 3:
				{
				setState(502); repeat_stmt();
				}
				break;
			case 4:
				{
				setState(503); while_stmt();
				}
				break;
			case 5:
				{
				setState(504); for_stmt();
				}
				break;
			case 6:
				{
				setState(505); foreach_stmt();
				}
				break;
			case 7:
				{
				setState(506); expression();
				}
				break;
			case 8:
				{
				setState(507); return_stmt();
				}
				break;
			case 9:
				{
				setState(508); break_stmt();
				}
				break;
			case 10:
				{
				setState(509); skip_stmt();
				}
				break;
			case 11:
				{
				setState(510); if_stmt();
				}
				break;
			case 12:
				{
				setState(511); match_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_stmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterRepeat_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitRepeat_stmt(this);
		}
	}

	public final Repeat_stmtContext repeat_stmt() throws RecognitionException {
		Repeat_stmtContext _localctx = new Repeat_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_repeat_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); match(T__60);
			setState(515); block();
			setState(516); match(T__74);
			setState(517); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); match(T__74);
			setState(520); expression();
			setState(521); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); match(T__65);
			setState(524); expression_list();
			setState(525); match(T__31);
			setState(526); expression();
			setState(527); match(T__31);
			setState(528); expression_list();
			setState(529); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterForeach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitForeach_stmt(this);
		}
	}

	public final Foreach_stmtContext foreach_stmt() throws RecognitionException {
		Foreach_stmtContext _localctx = new Foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_foreach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); match(T__76);
			setState(532); match(T__55);
			setState(533); match(ID);
			{
			setState(534); match(T__17);
			setState(535); type_(0);
			}
			setState(537); match(T__4);
			setState(538); expression();
			setState(539); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); match(T__35);
			setState(543);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(542); expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitBreak_stmt(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545); match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Skip_stmtContext extends ParserRuleContext {
		public Skip_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterSkip_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitSkip_stmt(this);
		}
	}

	public final Skip_stmtContext skip_stmt() throws RecognitionException {
		Skip_stmtContext _localctx = new Skip_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_skip_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); match(T__52);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549); match(T__28);
			setState(550); expression();
			setState(551); block();
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(552); match(T__5);
					setState(553); match(T__28);
					setState(554); expression();
					setState(555); block();
					}
					} 
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(562); match(T__5);
				setState(563); block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_stmtContext extends ParserRuleContext {
		public Match_eltContext match_elt(int i) {
			return getRuleContext(Match_eltContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Match_eltContext> match_elt() {
			return getRuleContexts(Match_eltContext.class);
		}
		public Match_elseContext match_else() {
			return getRuleContext(Match_elseContext.class,0);
		}
		public Match_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterMatch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitMatch_stmt(this);
		}
	}

	public final Match_stmtContext match_stmt() throws RecognitionException {
		Match_stmtContext _localctx = new Match_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_match_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566); match(T__43);
			setState(567); expression();
			setState(568); match(T__73);
			setState(570); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(569); match_elt();
				}
				}
				setState(572); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__53) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__43) | (1L << T__42) | (1L << T__41))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__7 - 67)) | (1L << (T__1 - 67)) | (1L << (ID - 67)) | (1L << (BOOLEAN - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (OVERRIDABLE_OP - 67)))) != 0) );
			setState(575);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(574); match_else();
				}
			}

			setState(577); match(T__29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_eltContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Match_eltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_elt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterMatch_elt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitMatch_elt(this);
		}
	}

	public final Match_eltContext match_elt() throws RecognitionException {
		Match_eltContext _localctx = new Match_eltContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_match_elt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); expression();
			setState(580); match(T__17);
			setState(581); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_elseContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Match_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterMatch_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitMatch_else(this);
		}
	}

	public final Match_elseContext match_else() throws RecognitionException {
		Match_elseContext _localctx = new Match_elseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_match_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(T__5);
			setState(584); match(T__17);
			setState(585); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(587); annotation();
				}
				}
				setState(590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__48 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public Optional_paramsContext optional_params() {
			return getRuleContext(Optional_paramsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); match(T__48);
			setState(593); match(ID);
			{
			setState(594); match(T__62);
			setState(595); optional_params();
			setState(596); match(T__3);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatesContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterTemplates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitTemplates(this);
		}
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_templates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598); match(T__51);
			setState(599); id_list();
			setState(600); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(602); param();
					setState(603); match(T__59);
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(610); param();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); match(T__55);
			setState(613); match(ID);
			setState(614); match(T__17);
			setState(615); type_(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_paramsContext extends ParserRuleContext {
		public Optional_paramContext optional_param(int i) {
			return getRuleContext(Optional_paramContext.class,i);
		}
		public List<Optional_paramContext> optional_param() {
			return getRuleContexts(Optional_paramContext.class);
		}
		public Optional_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOptional_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOptional_params(this);
		}
	}

	public final Optional_paramsContext optional_params() throws RecognitionException {
		Optional_paramsContext _localctx = new Optional_paramsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_optional_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617); optional_param();
					setState(618); match(T__59);
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(625); optional_param();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_paramContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Optional_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOptional_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOptional_param(this);
		}
	}

	public final Optional_paramContext optional_param() throws RecognitionException {
		Optional_paramContext _localctx = new Optional_paramContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_optional_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); param();
			setState(628); match(T__68);
			setState(629); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expression_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631); expression();
					setState(632); match(T__59);
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(639); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Op_assignContext op_assign() {
			return getRuleContext(Op_assignContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expression);
		int _la;
		try {
			setState(662);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(641); var_decl();
				setState(642); match(T__4);
				setState(643); expression();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(645); match(T__43);
				setState(646); expression();
				setState(647); match(T__73);
				setState(652); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(648); expression();
					setState(649); match(T__17);
					setState(650); expression();
					}
					}
					setState(654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__53) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__43) | (1L << T__42) | (1L << T__41))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__7 - 67)) | (1L << (T__1 - 67)) | (1L << (ID - 67)) | (1L << (BOOLEAN - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (OVERRIDABLE_OP - 67)))) != 0) );
				setState(656); match(T__5);
				setState(657); match(T__17);
				setState(658); expression();
				setState(659); match(T__29);
				}
				break;
			case T__73:
			case T__53:
			case T__49:
			case T__46:
			case T__42:
			case T__41:
			case T__16:
			case T__7:
			case T__1:
			case ID:
			case BOOLEAN:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case OVERRIDABLE_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(661); op_assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_assignContext extends ParserRuleContext {
		public Op_orContext op_or() {
			return getRuleContext(Op_orContext.class,0);
		}
		public Op_assignContext op_assign() {
			return getRuleContext(Op_assignContext.class,0);
		}
		public Op_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_assign(this);
		}
	}

	public final Op_assignContext op_assign() throws RecognitionException {
		Op_assignContext _localctx = new Op_assignContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_op_assign);
		int _la;
		try {
			setState(669);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664); op_or(0);
				setState(665);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__79) | (1L << T__70) | (1L << T__68) | (1L << T__66) | (1L << T__63) | (1L << T__61) | (1L << T__57) | (1L << T__38) | (1L << T__36) | (1L << T__32))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(666); op_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668); op_or(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_orContext extends ParserRuleContext {
		public Op_orContext op_or() {
			return getRuleContext(Op_orContext.class,0);
		}
		public Op_andContext op_and() {
			return getRuleContext(Op_andContext.class,0);
		}
		public Op_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_or(this);
		}
	}

	public final Op_orContext op_or() throws RecognitionException {
		return op_or(0);
	}

	private Op_orContext op_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_orContext _localctx = new Op_orContext(_ctx, _parentState);
		Op_orContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_op_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(672); op_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_orContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_or);
					setState(674);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(675); match(T__33);
					setState(676); op_and(0);
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_andContext extends ParserRuleContext {
		public Op_bin_orContext op_bin_or() {
			return getRuleContext(Op_bin_orContext.class,0);
		}
		public Op_andContext op_and() {
			return getRuleContext(Op_andContext.class,0);
		}
		public Op_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_and(this);
		}
	}

	public final Op_andContext op_and() throws RecognitionException {
		return op_and(0);
	}

	private Op_andContext op_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_andContext _localctx = new Op_andContext(_ctx, _parentState);
		Op_andContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_op_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(683); op_bin_or(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_andContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_and);
					setState(685);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(686); match(T__71);
					setState(687); op_bin_or(0);
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_bin_orContext extends ParserRuleContext {
		public Op_bin_xorContext op_bin_xor() {
			return getRuleContext(Op_bin_xorContext.class,0);
		}
		public Op_bin_orContext op_bin_or() {
			return getRuleContext(Op_bin_orContext.class,0);
		}
		public Op_bin_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bin_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_bin_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_bin_or(this);
		}
	}

	public final Op_bin_orContext op_bin_or() throws RecognitionException {
		return op_bin_or(0);
	}

	private Op_bin_orContext op_bin_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_bin_orContext _localctx = new Op_bin_orContext(_ctx, _parentState);
		Op_bin_orContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_op_bin_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(694); op_bin_xor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_bin_orContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_bin_or);
					setState(696);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(697); match(T__13);
					setState(698); op_bin_xor(0);
					}
					} 
				}
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_bin_xorContext extends ParserRuleContext {
		public Op_bin_xorContext op_bin_xor() {
			return getRuleContext(Op_bin_xorContext.class,0);
		}
		public Op_bin_andContext op_bin_and() {
			return getRuleContext(Op_bin_andContext.class,0);
		}
		public Op_bin_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bin_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_bin_xor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_bin_xor(this);
		}
	}

	public final Op_bin_xorContext op_bin_xor() throws RecognitionException {
		return op_bin_xor(0);
	}

	private Op_bin_xorContext op_bin_xor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_bin_xorContext _localctx = new Op_bin_xorContext(_ctx, _parentState);
		Op_bin_xorContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_op_bin_xor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(705); op_bin_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_bin_xorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_bin_xor);
					setState(707);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(708); match(T__67);
					setState(709); op_bin_and(0);
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_bin_andContext extends ParserRuleContext {
		public Op_bin_andContext op_bin_and() {
			return getRuleContext(Op_bin_andContext.class,0);
		}
		public Op_eqContext op_eq() {
			return getRuleContext(Op_eqContext.class,0);
		}
		public Op_bin_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bin_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_bin_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_bin_and(this);
		}
	}

	public final Op_bin_andContext op_bin_and() throws RecognitionException {
		return op_bin_and(0);
	}

	private Op_bin_andContext op_bin_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_bin_andContext _localctx = new Op_bin_andContext(_ctx, _parentState);
		Op_bin_andContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_op_bin_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(716); op_eq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_bin_andContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_bin_and);
					setState(718);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(719); match(T__23);
					setState(720); op_eq(0);
					}
					} 
				}
				setState(725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_eqContext extends ParserRuleContext {
		public Op_compareContext op_compare() {
			return getRuleContext(Op_compareContext.class,0);
		}
		public Op_eqContext op_eq() {
			return getRuleContext(Op_eqContext.class,0);
		}
		public Op_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_eq(this);
		}
	}

	public final Op_eqContext op_eq() throws RecognitionException {
		return op_eq(0);
	}

	private Op_eqContext op_eq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_eqContext _localctx = new Op_eqContext(_ctx, _parentState);
		Op_eqContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_op_eq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(727); op_compare(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_eqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_eq);
					setState(729);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(730);
					_la = _input.LA(1);
					if ( !(_la==T__75 || _la==T__14) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(731); op_compare(0);
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_compareContext extends ParserRuleContext {
		public Op_compareContext op_compare() {
			return getRuleContext(Op_compareContext.class,0);
		}
		public Op_shiftContext op_shift() {
			return getRuleContext(Op_shiftContext.class,0);
		}
		public Op_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_compare(this);
		}
	}

	public final Op_compareContext op_compare() throws RecognitionException {
		return op_compare(0);
	}

	private Op_compareContext op_compare(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_compareContext _localctx = new Op_compareContext(_ctx, _parentState);
		Op_compareContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_op_compare, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(738); op_shift(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_compareContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_compare);
					setState(740);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(741);
					_la = _input.LA(1);
					if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (T__54 - 29)) | (1L << (T__51 - 29)) | (1L << (T__26 - 29)) | (1L << (T__22 - 29)) | (1L << (T__9 - 29)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(742); op_shift(0);
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_shiftContext extends ParserRuleContext {
		public Op_addContext op_add() {
			return getRuleContext(Op_addContext.class,0);
		}
		public Op_shiftContext op_shift() {
			return getRuleContext(Op_shiftContext.class,0);
		}
		public Op_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_shift(this);
		}
	}

	public final Op_shiftContext op_shift() throws RecognitionException {
		return op_shift(0);
	}

	private Op_shiftContext op_shift(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_shiftContext _localctx = new Op_shiftContext(_ctx, _parentState);
		Op_shiftContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_op_shift, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(749); op_add(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_shiftContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_shift);
					setState(751);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(752);
					_la = _input.LA(1);
					if ( !(_la==T__72 || _la==T__30) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(753); op_add(0);
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_addContext extends ParserRuleContext {
		public Op_multContext op_mult() {
			return getRuleContext(Op_multContext.class,0);
		}
		public Op_addContext op_add() {
			return getRuleContext(Op_addContext.class,0);
		}
		public Op_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_add(this);
		}
	}

	public final Op_addContext op_add() throws RecognitionException {
		return op_add(0);
	}

	private Op_addContext op_add(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_addContext _localctx = new Op_addContext(_ctx, _parentState);
		Op_addContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_op_add, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(760); op_mult(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_addContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_add);
					setState(762);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(763);
					_la = _input.LA(1);
					if ( !(_la==T__41 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(764); op_mult(0);
					}
					} 
				}
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_multContext extends ParserRuleContext {
		public Op_multContext op_mult() {
			return getRuleContext(Op_multContext.class,0);
		}
		public Op_unaryContext op_unary() {
			return getRuleContext(Op_unaryContext.class,0);
		}
		public Op_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_mult(this);
		}
	}

	public final Op_multContext op_mult() throws RecognitionException {
		return op_mult(0);
	}

	private Op_multContext op_mult(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_multContext _localctx = new Op_multContext(_ctx, _parentState);
		Op_multContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_op_mult, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(771); op_unary(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_multContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_mult);
					setState(773);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(774);
					_la = _input.LA(1);
					if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (T__39 - 44)) | (1L << (T__21 - 44)) | (1L << (T__6 - 44)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(775); op_unary(0);
					}
					} 
				}
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_unaryContext extends ParserRuleContext {
		public Op_unaryContext op_unary() {
			return getRuleContext(Op_unaryContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Op_pointerContext op_pointer() {
			return getRuleContext(Op_pointerContext.class,0);
		}
		public Op_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_unary(this);
		}
	}

	public final Op_unaryContext op_unary() throws RecognitionException {
		return op_unary(0);
	}

	private Op_unaryContext op_unary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_unaryContext _localctx = new Op_unaryContext(_ctx, _parentState);
		Op_unaryContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_op_unary, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(782); match(T__7);
				setState(783); op_unary(10);
				}
				break;
			case 2:
				{
				setState(784); match(T__49);
				setState(785); op_unary(9);
				}
				break;
			case 3:
				{
				setState(786); match(T__41);
				setState(787); op_unary(8);
				}
				break;
			case 4:
				{
				setState(788); match(T__1);
				setState(789); op_unary(7);
				}
				break;
			case 5:
				{
				setState(790); match(T__53);
				setState(791); op_unary(6);
				}
				break;
			case 6:
				{
				setState(792); op_pointer(0);
				setState(793); match(T__53);
				}
				break;
			case 7:
				{
				setState(795); op_pointer(0);
				setState(796); match(T__15);
				}
				break;
			case 8:
				{
				setState(798); match(T__42);
				setState(799); op_pointer(0);
				}
				break;
			case 9:
				{
				setState(800); op_pointer(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_unaryContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_unary);
					setState(803);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(804); match(T__37);
					setState(805); type_(0);
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_pointerContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Fn_params_expressionsContext fn_params_expressions() {
			return getRuleContext(Fn_params_expressionsContext.class,0);
		}
		public Op_pointerContext op_pointer() {
			return getRuleContext(Op_pointerContext.class,0);
		}
		public Op_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterOp_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitOp_pointer(this);
		}
	}

	public final Op_pointerContext op_pointer() throws RecognitionException {
		return op_pointer(0);
	}

	private Op_pointerContext op_pointer(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_pointerContext _localctx = new Op_pointerContext(_ctx, _parentState);
		Op_pointerContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_op_pointer, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(812); value();
			}
			_ctx.stop = _input.LT(-1);
			setState(830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(828);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new Op_pointerContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_op_pointer);
						setState(814);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(815); match(T__20);
						setState(816); value();
						}
						break;
					case 2:
						{
						_localctx = new Op_pointerContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_op_pointer);
						setState(817);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(818); match(T__16);
						setState(819); expression_list();
						setState(820); match(T__50);
						}
						break;
					case 3:
						{
						_localctx = new Op_pointerContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_op_pointer);
						setState(822);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(823); match(T__62);
						setState(825);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__53) | (1L << T__49) | (1L << T__46) | (1L << T__45) | (1L << T__43) | (1L << T__42) | (1L << T__41))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__16 - 67)) | (1L << (T__7 - 67)) | (1L << (T__1 - 67)) | (1L << (ID - 67)) | (1L << (BOOLEAN - 67)) | (1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (OVERRIDABLE_OP - 67)))) != 0)) {
							{
							setState(824); fn_params_expressions();
							}
						}

						setState(827); match(T__3);
						}
						break;
					}
					} 
				}
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Fn_params_expressionsContext extends ParserRuleContext {
		public List<Fn_param_expressionContext> fn_param_expression() {
			return getRuleContexts(Fn_param_expressionContext.class);
		}
		public Fn_param_expressionContext fn_param_expression(int i) {
			return getRuleContext(Fn_param_expressionContext.class,i);
		}
		public Fn_params_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_params_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterFn_params_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitFn_params_expressions(this);
		}
	}

	public final Fn_params_expressionsContext fn_params_expressions() throws RecognitionException {
		Fn_params_expressionsContext _localctx = new Fn_params_expressionsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_fn_params_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(833); fn_param_expression();
					setState(834); match(T__59);
					}
					} 
				}
				setState(840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(841); fn_param_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_param_expressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Fn_param_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_param_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterFn_param_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitFn_param_expression(this);
		}
	}

	public final Fn_param_expressionContext fn_param_expression() throws RecognitionException {
		Fn_param_expressionContext _localctx = new Fn_param_expressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_fn_param_expression);
		try {
			setState(847);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(843); expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844); match(ID);
				setState(845); match(T__17);
				setState(846); expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_id_list);
		try {
			setState(853);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849); match(ID);
				setState(850); match(T__59);
				setState(851); id_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_namespace);
		try {
			setState(859);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(855); match(ID);
				setState(856); match(T__20);
				setState(857); namespace();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(ManaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ManaParser.STRING_LITERAL, 0); }
		public TerminalNode OVERRIDABLE_OP() { return getToken(ManaParser.OVERRIDABLE_OP, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ManaParser.HEX_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(ManaParser.BOOLEAN, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ManaParser.BINARY_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ManaParser.CHAR_LITERAL, 0); }
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(ManaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(ManaParser.HEX_FLOAT_LITERAL, 0); }
		public Array_comprehensionContext array_comprehension() {
			return getRuleContext(Array_comprehensionContext.class,0);
		}
		public Obj_fieldsContext obj_fields() {
			return getRuleContext(Obj_fieldsContext.class,0);
		}
		public TerminalNode OCT_LITERAL() { return getToken(ManaParser.OCT_LITERAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_value);
		try {
			setState(883);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862); match(DECIMAL_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(863); match(HEX_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(864); match(OCT_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(865); match(BINARY_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(866); match(FLOAT_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(867); match(HEX_FLOAT_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(868); match(STRING_LITERAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(869); match(CHAR_LITERAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(870); match(BOOLEAN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(871); match(OVERRIDABLE_OP);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(872); namespace();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(873); lambda_expression();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(874); array_comprehension();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(875); match(T__16);
				setState(876); expression_list();
				setState(877); match(T__50);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(879); match(T__73);
				setState(880); obj_fields();
				setState(881); match(T__29);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_expressionContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterLambda_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitLambda_expression(this);
		}
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_lambda_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885); match(T__46);
			setState(886); match(T__62);
			setState(888);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(887); params();
				}
			}

			setState(890); match(T__3);
			setState(893);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(891); match(T__19);
				setState(892); type_(0);
				}
			}

			setState(898);
			switch (_input.LA(1)) {
			case T__68:
				{
				{
				setState(895); match(T__68);
				setState(896); expression();
				}
				}
				break;
			case T__73:
				{
				setState(897); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_comprehensionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ManaParser.ID, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Array_comprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_comprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterArray_comprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitArray_comprehension(this);
		}
	}

	public final Array_comprehensionContext array_comprehension() throws RecognitionException {
		Array_comprehensionContext _localctx = new Array_comprehensionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_array_comprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900); match(T__16);
			setState(901); match(T__65);
			setState(902); match(ID);
			setState(905);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(903); match(T__17);
				setState(904); type_(0);
				}
			}

			setState(907); match(T__4);
			setState(908); expression();
			setState(911);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(909); match(T__28);
				setState(910); expression();
				}
			}

			setState(913); match(T__17);
			setState(914); expression();
			setState(915); match(T__50);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Obj_fieldsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ManaParser.ID); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(ManaParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Obj_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).enterObj_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManaListener ) ((ManaListener)listener).exitObj_fields(this);
		}
	}

	public final Obj_fieldsContext obj_fields() throws RecognitionException {
		Obj_fieldsContext _localctx = new Obj_fieldsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_obj_fields);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(917); match(ID);
					setState(918); match(T__68);
					setState(919); expression();
					setState(920); match(T__59);
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(927); match(ID);
			setState(928); match(T__68);
			setState(929); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return type__sempred((Type_Context)_localctx, predIndex);
		case 60: return op_or_sempred((Op_orContext)_localctx, predIndex);
		case 61: return op_and_sempred((Op_andContext)_localctx, predIndex);
		case 62: return op_bin_or_sempred((Op_bin_orContext)_localctx, predIndex);
		case 63: return op_bin_xor_sempred((Op_bin_xorContext)_localctx, predIndex);
		case 64: return op_bin_and_sempred((Op_bin_andContext)_localctx, predIndex);
		case 65: return op_eq_sempred((Op_eqContext)_localctx, predIndex);
		case 66: return op_compare_sempred((Op_compareContext)_localctx, predIndex);
		case 67: return op_shift_sempred((Op_shiftContext)_localctx, predIndex);
		case 68: return op_add_sempred((Op_addContext)_localctx, predIndex);
		case 69: return op_mult_sempred((Op_multContext)_localctx, predIndex);
		case 70: return op_unary_sempred((Op_unaryContext)_localctx, predIndex);
		case 71: return op_pointer_sempred((Op_pointerContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean op_bin_and_sempred(Op_bin_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_add_sempred(Op_addContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_bin_xor_sempred(Op_bin_xorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_pointer_sempred(Op_pointerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return precpred(_ctx, 4);
		case 13: return precpred(_ctx, 3);
		case 14: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_bin_or_sempred(Op_bin_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_unary_sempred(Op_unaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean op_mult_sempred(Op_multContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_or_sempred(Op_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_compare_sempred(Op_compareContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_and_sempred(Op_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_eq_sempred(Op_eqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_shift_sempred(Op_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean type__sempred(Type_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3c\u03a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\5\2\u00a4\n\2"+
		"\3\2\5\2\u00a7\n\2\3\3\3\3\3\3\5\3\u00ac\n\3\3\3\3\3\3\4\3\4\3\4\7\4\u00b3"+
		"\n\4\f\4\16\4\u00b6\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u00bf\n\5\3\6"+
		"\3\6\7\6\u00c3\n\6\f\6\16\6\u00c6\13\6\3\6\3\6\3\7\3\7\3\7\7\7\u00cd\n"+
		"\7\f\7\16\7\u00d0\13\7\3\7\3\7\3\b\3\b\3\b\6\b\u00d7\n\b\r\b\16\b\u00d8"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00e1\n\t\f\t\16\t\u00e4\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\7\n\u00eb\n\n\f\n\16\n\u00ee\13\n\3\n\3\n\3\13\5\13\u00f3\n\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ff\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0106\n\f\3\f\3\f\3\f\7\f\u010b\n\f\f\f\16\f\u010e\13\f\3"+
		"\r\3\r\3\r\7\r\u0113\n\r\f\r\16\r\u0116\13\r\3\r\3\r\3\16\3\16\3\16\7"+
		"\16\u011d\n\16\f\16\16\16\u0120\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\5\20\u012a\n\20\3\21\5\21\u012d\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\5\24\u013c\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\5\25\u0146\n\25\3\25\5\25\u0149\n\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\5\27\u0153\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u015a\n\27\f\27\16\27\u015d\13\27\3\30\5\30\u0160\n\30\3\30"+
		"\3\30\3\31\5\31\u0165\n\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\5\33\u016e"+
		"\n\33\3\33\5\33\u0171\n\33\3\33\3\33\3\33\5\33\u0176\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u017d\n\33\3\33\5\33\u0180\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0187\n\33\3\33\3\33\3\33\5\33\u018c\n\33\3\34\5\34\u018f\n"+
		"\34\3\34\3\34\3\35\3\35\3\35\5\35\u0196\n\35\3\35\5\35\u0199\n\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\6\36\u01a1\n\36\r\36\16\36\u01a2\3\37\5\37\u01a6"+
		"\n\37\3\37\3\37\3 \5 \u01ab\n \3 \3 \3!\3!\3!\3!\3!\5!\u01b4\n!\3\"\3"+
		"\"\3\"\3\"\5\"\u01ba\n\"\3\"\5\"\u01bd\n\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\5#\u01c7\n#\3#\5#\u01ca\n#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u01d7"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\5%\u01e0\n%\3&\3&\5&\u01e4\n&\3&\3&\3&\5&\u01e9"+
		"\n&\3&\3&\3&\3\'\3\'\7\'\u01f0\n\'\f\'\16\'\u01f3\13\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0203\n(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\5-\u0222\n"+
		"-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0230\n\60"+
		"\f\60\16\60\u0233\13\60\3\60\3\60\5\60\u0237\n\60\3\61\3\61\3\61\3\61"+
		"\6\61\u023d\n\61\r\61\16\61\u023e\3\61\5\61\u0242\n\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\6\64\u024f\n\64\r\64\16\64\u0250"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67"+
		"\u0260\n\67\f\67\16\67\u0263\13\67\3\67\3\67\38\38\38\38\38\39\39\39\7"+
		"9\u026f\n9\f9\169\u0272\139\39\39\3:\3:\3:\3:\3;\3;\3;\7;\u027d\n;\f;"+
		"\16;\u0280\13;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\6<\u028f\n<\r<\16"+
		"<\u0290\3<\3<\3<\3<\3<\3<\5<\u0299\n<\3=\3=\3=\3=\3=\5=\u02a0\n=\3>\3"+
		">\3>\3>\3>\3>\7>\u02a8\n>\f>\16>\u02ab\13>\3?\3?\3?\3?\3?\3?\7?\u02b3"+
		"\n?\f?\16?\u02b6\13?\3@\3@\3@\3@\3@\3@\7@\u02be\n@\f@\16@\u02c1\13@\3"+
		"A\3A\3A\3A\3A\3A\7A\u02c9\nA\fA\16A\u02cc\13A\3B\3B\3B\3B\3B\3B\7B\u02d4"+
		"\nB\fB\16B\u02d7\13B\3C\3C\3C\3C\3C\3C\7C\u02df\nC\fC\16C\u02e2\13C\3"+
		"D\3D\3D\3D\3D\3D\7D\u02ea\nD\fD\16D\u02ed\13D\3E\3E\3E\3E\3E\3E\7E\u02f5"+
		"\nE\fE\16E\u02f8\13E\3F\3F\3F\3F\3F\3F\7F\u0300\nF\fF\16F\u0303\13F\3"+
		"G\3G\3G\3G\3G\3G\7G\u030b\nG\fG\16G\u030e\13G\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0324\nH\3H\3H\3H\7H\u0329\nH"+
		"\fH\16H\u032c\13H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u033c\n"+
		"I\3I\7I\u033f\nI\fI\16I\u0342\13I\3J\3J\3J\7J\u0347\nJ\fJ\16J\u034a\13"+
		"J\3J\3J\3K\3K\3K\3K\5K\u0352\nK\3L\3L\3L\3L\5L\u0358\nL\3M\3M\3M\3M\5"+
		"M\u035e\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\5N\u0376\nN\3O\3O\3O\5O\u037b\nO\3O\3O\3O\5O\u0380\nO\3O\3O\3"+
		"O\5O\u0385\nO\3P\3P\3P\3P\3P\5P\u038c\nP\3P\3P\3P\3P\5P\u0392\nP\3P\3"+
		"P\3P\3P\3Q\3Q\3Q\3Q\3Q\7Q\u039d\nQ\fQ\16Q\u03a0\13Q\3Q\3Q\3Q\3Q\3Q\2\17"+
		"\26z|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090R\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\2\t\f\2\3\4\b\b\20\20"+
		"\25\25\33\33\35\35CCIKMMSS\f\2\5\6\17\17\21\21\23\23\26\26\30\30\34\34"+
		"//\61\61\65\65\4\2\n\nGG\7\2\37\37\"\";;??LL\4\2\r\r\67\67\4\2,,TT\5\2"+
		"..@@OO\u03d9\2\u00a3\3\2\2\2\4\u00a8\3\2\2\2\6\u00b4\3\2\2\2\b\u00b9\3"+
		"\2\2\2\n\u00c4\3\2\2\2\f\u00ce\3\2\2\2\16\u00d6\3\2\2\2\20\u00da\3\2\2"+
		"\2\22\u00ec\3\2\2\2\24\u00f2\3\2\2\2\26\u0105\3\2\2\2\30\u0114\3\2\2\2"+
		"\32\u011e\3\2\2\2\34\u0123\3\2\2\2\36\u0129\3\2\2\2 \u012c\3\2\2\2\"\u0133"+
		"\3\2\2\2$\u0138\3\2\2\2&\u013b\3\2\2\2(\u0142\3\2\2\2*\u014e\3\2\2\2,"+
		"\u0152\3\2\2\2.\u015f\3\2\2\2\60\u0164\3\2\2\2\62\u0168\3\2\2\2\64\u018b"+
		"\3\2\2\2\66\u018e\3\2\2\28\u0192\3\2\2\2:\u01a0\3\2\2\2<\u01a5\3\2\2\2"+
		">\u01aa\3\2\2\2@\u01ae\3\2\2\2B\u01b5\3\2\2\2D\u01c2\3\2\2\2F\u01d6\3"+
		"\2\2\2H\u01df\3\2\2\2J\u01e1\3\2\2\2L\u01ed\3\2\2\2N\u0202\3\2\2\2P\u0204"+
		"\3\2\2\2R\u0209\3\2\2\2T\u020d\3\2\2\2V\u0215\3\2\2\2X\u021f\3\2\2\2Z"+
		"\u0223\3\2\2\2\\\u0225\3\2\2\2^\u0227\3\2\2\2`\u0238\3\2\2\2b\u0245\3"+
		"\2\2\2d\u0249\3\2\2\2f\u024e\3\2\2\2h\u0252\3\2\2\2j\u0258\3\2\2\2l\u0261"+
		"\3\2\2\2n\u0266\3\2\2\2p\u0270\3\2\2\2r\u0275\3\2\2\2t\u027e\3\2\2\2v"+
		"\u0298\3\2\2\2x\u029f\3\2\2\2z\u02a1\3\2\2\2|\u02ac\3\2\2\2~\u02b7\3\2"+
		"\2\2\u0080\u02c2\3\2\2\2\u0082\u02cd\3\2\2\2\u0084\u02d8\3\2\2\2\u0086"+
		"\u02e3\3\2\2\2\u0088\u02ee\3\2\2\2\u008a\u02f9\3\2\2\2\u008c\u0304\3\2"+
		"\2\2\u008e\u0323\3\2\2\2\u0090\u032d\3\2\2\2\u0092\u0348\3\2\2\2\u0094"+
		"\u0351\3\2\2\2\u0096\u0357\3\2\2\2\u0098\u035d\3\2\2\2\u009a\u0375\3\2"+
		"\2\2\u009c\u0377\3\2\2\2\u009e\u0386\3\2\2\2\u00a0\u039e\3\2\2\2\u00a2"+
		"\u00a4\5\4\3\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u00a7\5\16\b\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\3\3\2\2\2\u00a8\u00a9\7U\2\2\u00a9\u00ab\7\27\2\2\u00aa\u00ac\5\6\4\2"+
		"\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\7R\2\2\u00ae\5\3\2\2\2\u00af\u00b0\5\b\5\2\u00b0\u00b1\7\32\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b8\5\b\5\2\u00b8\7\3\2\2\2\u00b9\u00be\5\n\6\2\u00ba\u00bb\7\f\2\2"+
		"\u00bb\u00bc\5\f\7\2\u00bc\u00bd\78\2\2\u00bd\u00bf\3\2\2\2\u00be\u00ba"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\t\3\2\2\2\u00c0\u00c1\7V\2\2\u00c1"+
		"\u00c3\7A\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c8\7V\2\2\u00c8\13\3\2\2\2\u00c9\u00ca\5\n\6\2\u00ca\u00cb\7\32\2"+
		"\2\u00cb\u00cd\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\5\n\6\2\u00d2\r\3\2\2\2\u00d3\u00d7\5\20\t\2\u00d4\u00d7\5F$\2"+
		"\u00d5\u00d7\5\36\20\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\17\3\2\2\2\u00da\u00db\7-\2\2\u00db\u00dc\7V\2\2\u00dc\u00e2\7\f\2\2"+
		"\u00dd\u00e1\5\20\t\2\u00de\u00e1\5F$\2\u00df\u00e1\5\36\20\2\u00e0\u00dd"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\78\2\2\u00e6\21\3\2\2\2\u00e7\u00e8\5\24\13\2\u00e8\u00e9"+
		"\7\32\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f0\5\24\13\2\u00f0\23\3\2\2\2\u00f1\u00f3\7\36\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7V"+
		"\2\2\u00f5\u00f6\7D\2\2\u00f6\u00f7\5\26\f\2\u00f7\25\3\2\2\2\u00f8\u00f9"+
		"\b\f\1\2\u00f9\u00fe\5\u0098M\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc\5\32\16"+
		"\2\u00fc\u00fd\7L\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0106\3\2\2\2\u0100\u0106\5\34\17\2\u0101\u0102\7\f\2\2"+
		"\u0102\u0103\5\30\r\2\u0103\u0104\78\2\2\u0104\u0106\3\2\2\2\u0105\u00f8"+
		"\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0106\u010c\3\2\2\2\u0107"+
		"\u0108\f\4\2\2\u0108\u0109\7E\2\2\u0109\u010b\7#\2\2\u010a\u0107\3\2\2"+
		"\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\27"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\5\u0098M\2\u0110\u0111\7\32\2"+
		"\2\u0111\u0113\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\5\u0098M\2\u0118\31\3\2\2\2\u0119\u011a\5\26\f\2\u011a\u011b\7"+
		"\32\2\2\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\5\26\f\2\u0122\33\3\2\2\2\u0123\u0124\t\2\2\2\u0124\35"+
		"\3\2\2\2\u0125\u012a\5(\25\2\u0126\u012a\58\35\2\u0127\u012a\5 \21\2\u0128"+
		"\u012a\5&\24\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a\37\3\2\2\2\u012b\u012d\7=\2\2\u012c\u012b"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7:\2\2\u012f"+
		"\u0130\7\f\2\2\u0130\u0131\5\"\22\2\u0131\u0132\78\2\2\u0132!\3\2\2\2"+
		"\u0133\u0134\5$\23\2\u0134\u0135\7\32\2\2\u0135\u0136\3\2\2\2\u0136\u0137"+
		"\5$\23\2\u0137#\3\2\2\2\u0138\u0139\7V\2\2\u0139%\3\2\2\2\u013a\u013c"+
		"\7=\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\7&\2\2\u013e\u013f\7V\2\2\u013f\u0140\7\21\2\2\u0140\u0141\5\26"+
		"\f\2\u0141\'\3\2\2\2\u0142\u0143\7\63\2\2\u0143\u0145\7V\2\2\u0144\u0146"+
		"\5j\66\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0149\5*\26\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\7\f\2\2\u014b\u014c\5,\27\2\u014c\u014d\78\2\2\u014d"+
		")\3\2\2\2\u014e\u014f\7D\2\2\u014f\u0150\5@!\2\u0150+\3\2\2\2\u0151\u0153"+
		"\5f\64\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u015b\3\2\2\2\u0154"+
		"\u015a\5.\30\2\u0155\u015a\5\64\33\2\u0156\u015a\5\62\32\2\u0157\u015a"+
		"\5\66\34\2\u0158\u015a\5\60\31\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2"+
		"\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c-\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0160\7=\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0162\5F$\2\u0162/\3\2\2\2\u0163\u0165"+
		"\7=\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\5H%\2\u0167\61\3\2\2\2\u0168\u0169\7)\2\2\u0169\u016a\5.\30\2\u016a"+
		"\63\3\2\2\2\u016b\u016d\7(\2\2\u016c\u016e\7=\2\2\u016d\u016c\3\2\2\2"+
		"\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\7\36\2\2\u0170\u016f"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\5\u0096L"+
		"\2\u0173\u0174\7D\2\2\u0174\u0176\5\26\f\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\21\2\2\u0178\u0179\5t;\2\u0179"+
		"\u018c\3\2\2\2\u017a\u017c\7(\2\2\u017b\u017d\7=\2\2\u017c\u017b\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\7\36\2\2\u017f"+
		"\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\27"+
		"\2\2\u0182\u0183\5\u0096L\2\u0183\u0186\7R\2\2\u0184\u0185\7D\2\2\u0185"+
		"\u0187\5\26\f\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3"+
		"\2\2\2\u0188\u0189\7\21\2\2\u0189\u018a\5t;\2\u018a\u018c\3\2\2\2\u018b"+
		"\u016b\3\2\2\2\u018b\u017a\3\2\2\2\u018c\65\3\2\2\2\u018d\u018f\7=\2\2"+
		"\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191"+
		"\5\64\33\2\u0191\67\3\2\2\2\u0192\u0193\7\7\2\2\u0193\u0195\7V\2\2\u0194"+
		"\u0196\5j\66\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0199\5*\26\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\7\f\2\2\u019b\u019c\5:\36\2\u019c\u019d\78"+
		"\2\2\u019d9\3\2\2\2\u019e\u01a1\5<\37\2\u019f\u01a1\5> \2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3;\3\2\2\2\u01a4\u01a6\7=\2\2\u01a5\u01a4\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\5B\"\2\u01a8=\3\2\2\2\u01a9"+
		"\u01ab\7=\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ad\5D#\2\u01ad?\3\2\2\2\u01ae\u01b3\5\u0098M\2\u01af\u01b0"+
		"\7\"\2\2\u01b0\u01b1\5\32\16\2\u01b1\u01b2\7L\2\2\u01b2\u01b4\3\2\2\2"+
		"\u01b3\u01af\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4A\3\2\2\2\u01b5\u01b6\7"+
		"\'\2\2\u01b6\u01b7\7V\2\2\u01b7\u01b9\7\27\2\2\u01b8\u01ba\5l\67\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01bd\5p"+
		"9\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\7R\2\2\u01bf\u01c0\7B\2\2\u01c0\u01c1\5\26\f\2\u01c1C\3\2\2\2\u01c2"+
		"\u01c3\7\'\2\2\u01c3\u01c4\7`\2\2\u01c4\u01c6\7\27\2\2\u01c5\u01c7\5l"+
		"\67\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01ca\5p9\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2"+
		"\2\u01cb\u01cc\7R\2\2\u01cc\u01cd\7B\2\2\u01cd\u01ce\5\26\f\2\u01ceE\3"+
		"\2\2\2\u01cf\u01d0\5B\"\2\u01d0\u01d1\5L\'\2\u01d1\u01d7\3\2\2\2\u01d2"+
		"\u01d3\5B\"\2\u01d3\u01d4\7\21\2\2\u01d4\u01d5\5v<\2\u01d5\u01d7\3\2\2"+
		"\2\u01d6\u01cf\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d7G\3\2\2\2\u01d8\u01d9"+
		"\5D#\2\u01d9\u01da\5L\'\2\u01da\u01e0\3\2\2\2\u01db\u01dc\5D#\2\u01dc"+
		"\u01dd\7\21\2\2\u01dd\u01de\5v<\2\u01de\u01e0\3\2\2\2\u01df\u01d8\3\2"+
		"\2\2\u01df\u01db\3\2\2\2\u01e0I\3\2\2\2\u01e1\u01e3\7(\2\2\u01e2\u01e4"+
		"\7\36\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2"+
		"\u01e5\u01e8\5\u0096L\2\u01e6\u01e7\7D\2\2\u01e7\u01e9\5\26\f\2\u01e8"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\7\21"+
		"\2\2\u01eb\u01ec\5t;\2\u01ecK\3\2\2\2\u01ed\u01f1\7\f\2\2\u01ee\u01f0"+
		"\5N(\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\78"+
		"\2\2\u01f5M\3\2\2\2\u01f6\u0203\5L\'\2\u01f7\u0203\5J&\2\u01f8\u0203\5"+
		"P)\2\u01f9\u0203\5R*\2\u01fa\u0203\5T+\2\u01fb\u0203\5V,\2\u01fc\u0203"+
		"\5v<\2\u01fd\u0203\5X-\2\u01fe\u0203\5Z.\2\u01ff\u0203\5\\/\2\u0200\u0203"+
		"\5^\60\2\u0201\u0203\5`\61\2\u0202\u01f6\3\2\2\2\u0202\u01f7\3\2\2\2\u0202"+
		"\u01f8\3\2\2\2\u0202\u01f9\3\2\2\2\u0202\u01fa\3\2\2\2\u0202\u01fb\3\2"+
		"\2\2\u0202\u01fc\3\2\2\2\u0202\u01fd\3\2\2\2\u0202\u01fe\3\2\2\2\u0202"+
		"\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203O\3\2\2\2"+
		"\u0204\u0205\7\31\2\2\u0205\u0206\5L\'\2\u0206\u0207\7\13\2\2\u0207\u0208"+
		"\5v<\2\u0208Q\3\2\2\2\u0209\u020a\7\13\2\2\u020a\u020b\5v<\2\u020b\u020c"+
		"\5L\'\2\u020cS\3\2\2\2\u020d\u020e\7\24\2\2\u020e\u020f\5t;\2\u020f\u0210"+
		"\7\66\2\2\u0210\u0211\5v<\2\u0211\u0212\7\66\2\2\u0212\u0213\5t;\2\u0213"+
		"\u0214\5L\'\2\u0214U\3\2\2\2\u0215\u0216\7\t\2\2\u0216\u0217\7\36\2\2"+
		"\u0217\u0218\7V\2\2\u0218\u0219\7D\2\2\u0219\u021a\5\26\f\2\u021a\u021b"+
		"\3\2\2\2\u021b\u021c\7Q\2\2\u021c\u021d\5v<\2\u021d\u021e\5L\'\2\u021e"+
		"W\3\2\2\2\u021f\u0221\7\62\2\2\u0220\u0222\5v<\2\u0221\u0220\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222Y\3\2\2\2\u0223\u0224\7<\2\2\u0224[\3\2\2\2\u0225"+
		"\u0226\7!\2\2\u0226]\3\2\2\2\u0227\u0228\79\2\2\u0228\u0229\5v<\2\u0229"+
		"\u0231\5L\'\2\u022a\u022b\7P\2\2\u022b\u022c\79\2\2\u022c\u022d\5v<\2"+
		"\u022d\u022e\5L\'\2\u022e\u0230\3\2\2\2\u022f\u022a\3\2\2\2\u0230\u0233"+
		"\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0236\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0234\u0235\7P\2\2\u0235\u0237\5L\'\2\u0236\u0234\3\2\2"+
		"\2\u0236\u0237\3\2\2\2\u0237_\3\2\2\2\u0238\u0239\7*\2\2\u0239\u023a\5"+
		"v<\2\u023a\u023c\7\f\2\2\u023b\u023d\5b\62\2\u023c\u023b\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2"+
		"\2\2\u0240\u0242\5d\63\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0244\78\2\2\u0244a\3\2\2\2\u0245\u0246\5v<\2\u0246"+
		"\u0247\7D\2\2\u0247\u0248\5N(\2\u0248c\3\2\2\2\u0249\u024a\7P\2\2\u024a"+
		"\u024b\7D\2\2\u024b\u024c\5N(\2\u024ce\3\2\2\2\u024d\u024f\5h\65\2\u024e"+
		"\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251g\3\2\2\2\u0252\u0253\7%\2\2\u0253\u0254\7V\2\2\u0254\u0255"+
		"\7\27\2\2\u0255\u0256\5p9\2\u0256\u0257\7R\2\2\u0257i\3\2\2\2\u0258\u0259"+
		"\7\"\2\2\u0259\u025a\5\u0096L\2\u025a\u025b\7L\2\2\u025bk\3\2\2\2\u025c"+
		"\u025d\5n8\2\u025d\u025e\7\32\2\2\u025e\u0260\3\2\2\2\u025f\u025c\3\2"+
		"\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0265\5n8\2\u0265m\3\2\2\2\u0266"+
		"\u0267\7\36\2\2\u0267\u0268\7V\2\2\u0268\u0269\7D\2\2\u0269\u026a\5\26"+
		"\f\2\u026ao\3\2\2\2\u026b\u026c\5r:\2\u026c\u026d\7\32\2\2\u026d\u026f"+
		"\3\2\2\2\u026e\u026b\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0274\5r"+
		":\2\u0274q\3\2\2\2\u0275\u0276\5n8\2\u0276\u0277\7\21\2\2\u0277\u0278"+
		"\5v<\2\u0278s\3\2\2\2\u0279\u027a\5v<\2\u027a\u027b\7\32\2\2\u027b\u027d"+
		"\3\2\2\2\u027c\u0279\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282\5v"+
		"<\2\u0282u\3\2\2\2\u0283\u0284\5J&\2\u0284\u0285\7Q\2\2\u0285\u0286\5"+
		"v<\2\u0286\u0299\3\2\2\2\u0287\u0288\7*\2\2\u0288\u0289\5v<\2\u0289\u028e"+
		"\7\f\2\2\u028a\u028b\5v<\2\u028b\u028c\7D\2\2\u028c\u028d\5v<\2\u028d"+
		"\u028f\3\2\2\2\u028e\u028a\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u028e\3\2"+
		"\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\7P\2\2\u0293"+
		"\u0294\7D\2\2\u0294\u0295\5v<\2\u0295\u0296\78\2\2\u0296\u0299\3\2\2\2"+
		"\u0297\u0299\5x=\2\u0298\u0283\3\2\2\2\u0298\u0287\3\2\2\2\u0298\u0297"+
		"\3\2\2\2\u0299w\3\2\2\2\u029a\u029b\5z>\2\u029b\u029c\t\3\2\2\u029c\u029d"+
		"\5x=\2\u029d\u02a0\3\2\2\2\u029e\u02a0\5z>\2\u029f\u029a\3\2\2\2\u029f"+
		"\u029e\3\2\2\2\u02a0y\3\2\2\2\u02a1\u02a2\b>\1\2\u02a2\u02a3\5|?\2\u02a3"+
		"\u02a9\3\2\2\2\u02a4\u02a5\f\4\2\2\u02a5\u02a6\7\64\2\2\u02a6\u02a8\5"+
		"|?\2\u02a7\u02a4\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa{\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\b?\1\2\u02ad"+
		"\u02ae\5~@\2\u02ae\u02b4\3\2\2\2\u02af\u02b0\f\4\2\2\u02b0\u02b1\7\16"+
		"\2\2\u02b1\u02b3\5~@\2\u02b2\u02af\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5}\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02b8\b@\1\2\u02b8\u02b9\5\u0080A\2\u02b9\u02bf\3\2\2\2\u02ba\u02bb\f"+
		"\4\2\2\u02bb\u02bc\7H\2\2\u02bc\u02be\5\u0080A\2\u02bd\u02ba\3\2\2\2\u02be"+
		"\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\177\3\2\2"+
		"\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\bA\1\2\u02c3\u02c4\5\u0082B\2\u02c4"+
		"\u02ca\3\2\2\2\u02c5\u02c6\f\4\2\2\u02c6\u02c7\7\22\2\2\u02c7\u02c9\5"+
		"\u0082B\2\u02c8\u02c5\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2"+
		"\u02ca\u02cb\3\2\2\2\u02cb\u0081\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce"+
		"\bB\1\2\u02ce\u02cf\5\u0084C\2\u02cf\u02d5\3\2\2\2\u02d0\u02d1\f\4\2\2"+
		"\u02d1\u02d2\7>\2\2\u02d2\u02d4\5\u0084C\2\u02d3\u02d0\3\2\2\2\u02d4\u02d7"+
		"\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u0083\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d8\u02d9\bC\1\2\u02d9\u02da\5\u0086D\2\u02da\u02e0\3"+
		"\2\2\2\u02db\u02dc\f\4\2\2\u02dc\u02dd\t\4\2\2\u02dd\u02df\5\u0086D\2"+
		"\u02de\u02db\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1"+
		"\3\2\2\2\u02e1\u0085\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\bD\1\2\u02e4"+
		"\u02e5\5\u0088E\2\u02e5\u02eb\3\2\2\2\u02e6\u02e7\f\4\2\2\u02e7\u02e8"+
		"\t\5\2\2\u02e8\u02ea\5\u0088E\2\u02e9\u02e6\3\2\2\2\u02ea\u02ed\3\2\2"+
		"\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u0087\3\2\2\2\u02ed\u02eb"+
		"\3\2\2\2\u02ee\u02ef\bE\1\2\u02ef\u02f0\5\u008aF\2\u02f0\u02f6\3\2\2\2"+
		"\u02f1\u02f2\f\4\2\2\u02f2\u02f3\t\6\2\2\u02f3\u02f5\5\u008aF\2\u02f4"+
		"\u02f1\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u0089\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fa\bF\1\2\u02fa"+
		"\u02fb\5\u008cG\2\u02fb\u0301\3\2\2\2\u02fc\u02fd\f\4\2\2\u02fd\u02fe"+
		"\t\7\2\2\u02fe\u0300\5\u008cG\2\u02ff\u02fc\3\2\2\2\u0300\u0303\3\2\2"+
		"\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u008b\3\2\2\2\u0303\u0301"+
		"\3\2\2\2\u0304\u0305\bG\1\2\u0305\u0306\5\u008eH\2\u0306\u030c\3\2\2\2"+
		"\u0307\u0308\f\4\2\2\u0308\u0309\t\b\2\2\u0309\u030b\5\u008eH\2\u030a"+
		"\u0307\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\u008d\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0310\bH\1\2\u0310"+
		"\u0311\7N\2\2\u0311\u0324\5\u008eH\f\u0312\u0313\7$\2\2\u0313\u0324\5"+
		"\u008eH\13\u0314\u0315\7,\2\2\u0315\u0324\5\u008eH\n\u0316\u0317\7T\2"+
		"\2\u0317\u0324\5\u008eH\t\u0318\u0319\7 \2\2\u0319\u0324\5\u008eH\b\u031a"+
		"\u031b\5\u0090I\2\u031b\u031c\7 \2\2\u031c\u0324\3\2\2\2\u031d\u031e\5"+
		"\u0090I\2\u031e\u031f\7F\2\2\u031f\u0324\3\2\2\2\u0320\u0321\7+\2\2\u0321"+
		"\u0324\5\u0090I\2\u0322\u0324\5\u0090I\2\u0323\u030f\3\2\2\2\u0323\u0312"+
		"\3\2\2\2\u0323\u0314\3\2\2\2\u0323\u0316\3\2\2\2\u0323\u0318\3\2\2\2\u0323"+
		"\u031a\3\2\2\2\u0323\u031d\3\2\2\2\u0323\u0320\3\2\2\2\u0323\u0322\3\2"+
		"\2\2\u0324\u032a\3\2\2\2\u0325\u0326\f\5\2\2\u0326\u0327\7\60\2\2\u0327"+
		"\u0329\5\26\f\2\u0328\u0325\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3"+
		"\2\2\2\u032a\u032b\3\2\2\2\u032b\u008f\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u032e\bI\1\2\u032e\u032f\5\u009aN\2\u032f\u0340\3\2\2\2\u0330\u0331\f"+
		"\6\2\2\u0331\u0332\7A\2\2\u0332\u033f\5\u009aN\2\u0333\u0334\f\5\2\2\u0334"+
		"\u0335\7E\2\2\u0335\u0336\5t;\2\u0336\u0337\7#\2\2\u0337\u033f\3\2\2\2"+
		"\u0338\u0339\f\4\2\2\u0339\u033b\7\27\2\2\u033a\u033c\5\u0092J\2\u033b"+
		"\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\7R"+
		"\2\2\u033e\u0330\3\2\2\2\u033e\u0333\3\2\2\2\u033e\u0338\3\2\2\2\u033f"+
		"\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0091\3\2"+
		"\2\2\u0342\u0340\3\2\2\2\u0343\u0344\5\u0094K\2\u0344\u0345\7\32\2\2\u0345"+
		"\u0347\3\2\2\2\u0346\u0343\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2"+
		"\2\2\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u0348\3\2\2\2\u034b"+
		"\u034c\5\u0094K\2\u034c\u0093\3\2\2\2\u034d\u0352\5v<\2\u034e\u034f\7"+
		"V\2\2\u034f\u0350\7D\2\2\u0350\u0352\5v<\2\u0351\u034d\3\2\2\2\u0351\u034e"+
		"\3\2\2\2\u0352\u0095\3\2\2\2\u0353\u0354\7V\2\2\u0354\u0355\7\32\2\2\u0355"+
		"\u0358\5\u0096L\2\u0356\u0358\7V\2\2\u0357\u0353\3\2\2\2\u0357\u0356\3"+
		"\2\2\2\u0358\u0097\3\2\2\2\u0359\u035a\7V\2\2\u035a\u035b\7A\2\2\u035b"+
		"\u035e\5\u0098M\2\u035c\u035e\7V\2\2\u035d\u0359\3\2\2\2\u035d\u035c\3"+
		"\2\2\2\u035e\u0099\3\2\2\2\u035f\u0376\7V\2\2\u0360\u0376\7X\2\2\u0361"+
		"\u0376\7Y\2\2\u0362\u0376\7Z\2\2\u0363\u0376\7[\2\2\u0364\u0376\7\\\2"+
		"\2\u0365\u0376\7]\2\2\u0366\u0376\7_\2\2\u0367\u0376\7^\2\2\u0368\u0376"+
		"\7W\2\2\u0369\u0376\7`\2\2\u036a\u0376\5\u0098M\2\u036b\u0376\5\u009c"+
		"O\2\u036c\u0376\5\u009eP\2\u036d\u036e\7E\2\2\u036e\u036f\5t;\2\u036f"+
		"\u0370\7#\2\2\u0370\u0376\3\2\2\2\u0371\u0372\7\f\2\2\u0372\u0373\5\u00a0"+
		"Q\2\u0373\u0374\78\2\2\u0374\u0376\3\2\2\2\u0375\u035f\3\2\2\2\u0375\u0360"+
		"\3\2\2\2\u0375\u0361\3\2\2\2\u0375\u0362\3\2\2\2\u0375\u0363\3\2\2\2\u0375"+
		"\u0364\3\2\2\2\u0375\u0365\3\2\2\2\u0375\u0366\3\2\2\2\u0375\u0367\3\2"+
		"\2\2\u0375\u0368\3\2\2\2\u0375\u0369\3\2\2\2\u0375\u036a\3\2\2\2\u0375"+
		"\u036b\3\2\2\2\u0375\u036c\3\2\2\2\u0375\u036d\3\2\2\2\u0375\u0371\3\2"+
		"\2\2\u0376\u009b\3\2\2\2\u0377\u0378\7\'\2\2\u0378\u037a\7\27\2\2\u0379"+
		"\u037b\5l\67\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\3\2"+
		"\2\2\u037c\u037f\7R\2\2\u037d\u037e\7B\2\2\u037e\u0380\5\26\f\2\u037f"+
		"\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0384\3\2\2\2\u0381\u0382\7\21"+
		"\2\2\u0382\u0385\5v<\2\u0383\u0385\5L\'\2\u0384\u0381\3\2\2\2\u0384\u0383"+
		"\3\2\2\2\u0385\u009d\3\2\2\2\u0386\u0387\7E\2\2\u0387\u0388\7\24\2\2\u0388"+
		"\u038b\7V\2\2\u0389\u038a\7D\2\2\u038a\u038c\5\26\f\2\u038b\u0389\3\2"+
		"\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\7Q\2\2\u038e"+
		"\u0391\5v<\2\u038f\u0390\79\2\2\u0390\u0392\5v<\2\u0391\u038f\3\2\2\2"+
		"\u0391\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\7D\2\2\u0394\u0395"+
		"\5v<\2\u0395\u0396\7#\2\2\u0396\u009f\3\2\2\2\u0397\u0398\7V\2\2\u0398"+
		"\u0399\7\21\2\2\u0399\u039a\5v<\2\u039a\u039b\7\32\2\2\u039b\u039d\3\2"+
		"\2\2\u039c\u0397\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03a1\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a2\7V"+
		"\2\2\u03a2\u03a3\7\21\2\2\u03a3\u03a4\5v<\2\u03a4\u00a1\3\2\2\2]\u00a3"+
		"\u00a6\u00ab\u00b4\u00be\u00c4\u00ce\u00d6\u00d8\u00e0\u00e2\u00ec\u00f2"+
		"\u00fe\u0105\u010c\u0114\u011e\u0129\u012c\u013b\u0145\u0148\u0152\u0159"+
		"\u015b\u015f\u0164\u016d\u0170\u0175\u017c\u017f\u0186\u018b\u018e\u0195"+
		"\u0198\u01a0\u01a2\u01a5\u01aa\u01b3\u01b9\u01bc\u01c6\u01c9\u01d6\u01df"+
		"\u01e3\u01e8\u01f1\u0202\u0221\u0231\u0236\u023e\u0241\u0250\u0261\u0270"+
		"\u027e\u0290\u0298\u029f\u02a9\u02b4\u02bf\u02ca\u02d5\u02e0\u02eb\u02f6"+
		"\u0301\u030c\u0323\u032a\u033b\u033e\u0340\u0348\u0351\u0357\u035d\u0375"+
		"\u037a\u037f\u0384\u038b\u0391\u039e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}