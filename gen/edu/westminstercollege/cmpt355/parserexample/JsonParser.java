// Generated from java-escape by ANTLR 4.11.1
package edu.westminstercollege.cmpt355.parserexample;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NUMBER=10, STRING=11, WHITESPACE=12;
	public static final int
		RULE_json = 0, RULE_value = 1, RULE_array = 2, RULE_values = 3, RULE_object = 4, 
		RULE_element = 5, RULE_elements = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "value", "array", "values", "object", "element", "elements"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'null'", "'['", "']'", "','", "'{'", "'}'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"STRING", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JsonParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JsonParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				array();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				object();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(20);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(21);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(22);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__3);
				setState(26);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(T__3);
				setState(28);
				values();
				setState(29);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_values);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				value();
				setState(35);
				match(T__5);
				setState(36);
				values();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__6);
				setState(41);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(T__6);
				setState(43);
				elements();
				setState(44);
				match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JsonParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(STRING);
			setState(49);
			match(T__8);
			setState(50);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elements);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				element();
				setState(54);
				match(T__5);
				setState(55);
				elements();
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

	public static final String _serializedATN =
		"\u0004\u0001\f<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004/\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006:\b"+
		"\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000"+
		"\u0000>\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000"+
		"\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000"+
		"\b.\u0001\u0000\u0000\u0000\n0\u0001\u0000\u0000\u0000\f9\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0001\u0001\u0000"+
		"\u0000\u0000\u0010\u0018\u0003\u0004\u0002\u0000\u0011\u0018\u0003\b\u0004"+
		"\u0000\u0012\u0018\u0005\u000b\u0000\u0000\u0013\u0018\u0005\n\u0000\u0000"+
		"\u0014\u0018\u0005\u0001\u0000\u0000\u0015\u0018\u0005\u0002\u0000\u0000"+
		"\u0016\u0018\u0005\u0003\u0000\u0000\u0017\u0010\u0001\u0000\u0000\u0000"+
		"\u0017\u0011\u0001\u0000\u0000\u0000\u0017\u0012\u0001\u0000\u0000\u0000"+
		"\u0017\u0013\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0004\u0000\u0000"+
		"\u001a \u0005\u0005\u0000\u0000\u001b\u001c\u0005\u0004\u0000\u0000\u001c"+
		"\u001d\u0003\u0006\u0003\u0000\u001d\u001e\u0005\u0005\u0000\u0000\u001e"+
		" \u0001\u0000\u0000\u0000\u001f\u0019\u0001\u0000\u0000\u0000\u001f\u001b"+
		"\u0001\u0000\u0000\u0000 \u0005\u0001\u0000\u0000\u0000!\'\u0003\u0002"+
		"\u0001\u0000\"#\u0003\u0002\u0001\u0000#$\u0005\u0006\u0000\u0000$%\u0003"+
		"\u0006\u0003\u0000%\'\u0001\u0000\u0000\u0000&!\u0001\u0000\u0000\u0000"+
		"&\"\u0001\u0000\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000()\u0005\u0007"+
		"\u0000\u0000)/\u0005\b\u0000\u0000*+\u0005\u0007\u0000\u0000+,\u0003\f"+
		"\u0006\u0000,-\u0005\b\u0000\u0000-/\u0001\u0000\u0000\u0000.(\u0001\u0000"+
		"\u0000\u0000.*\u0001\u0000\u0000\u0000/\t\u0001\u0000\u0000\u000001\u0005"+
		"\u000b\u0000\u000012\u0005\t\u0000\u000023\u0003\u0002\u0001\u00003\u000b"+
		"\u0001\u0000\u0000\u00004:\u0003\n\u0005\u000056\u0003\n\u0005\u00006"+
		"7\u0005\u0006\u0000\u000078\u0003\f\u0006\u00008:\u0001\u0000\u0000\u0000"+
		"94\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u0000:\r\u0001\u0000\u0000"+
		"\u0000\u0005\u0017\u001f&.9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}