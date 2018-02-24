package compiler;
// Generated from Mana.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ManaParser}.
 */
public interface ManaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ManaParser#fn_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFn_param_list(@NotNull ManaParser.Fn_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#fn_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFn_param_list(@NotNull ManaParser.Fn_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#array_comprehension}.
	 * @param ctx the parse tree
	 */
	void enterArray_comprehension(@NotNull ManaParser.Array_comprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#array_comprehension}.
	 * @param ctx the parse tree
	 */
	void exitArray_comprehension(@NotNull ManaParser.Array_comprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_add}.
	 * @param ctx the parse tree
	 */
	void enterOp_add(@NotNull ManaParser.Op_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_add}.
	 * @param ctx the parse tree
	 */
	void exitOp_add(@NotNull ManaParser.Op_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(@NotNull ManaParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(@NotNull ManaParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(@NotNull ManaParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(@NotNull ManaParser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ManaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ManaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void enterOp_decl(@NotNull ManaParser.Op_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void exitOp_decl(@NotNull ManaParser.Op_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#class_method}.
	 * @param ctx the parse tree
	 */
	void enterClass_method(@NotNull ManaParser.Class_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#class_method}.
	 * @param ctx the parse tree
	 */
	void exitClass_method(@NotNull ManaParser.Class_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(@NotNull ManaParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(@NotNull ManaParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ManaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ManaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_eq}.
	 * @param ctx the parse tree
	 */
	void enterOp_eq(@NotNull ManaParser.Op_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_eq}.
	 * @param ctx the parse tree
	 */
	void exitOp_eq(@NotNull ManaParser.Op_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#fn_decl}.
	 * @param ctx the parse tree
	 */
	void enterFn_decl(@NotNull ManaParser.Fn_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#fn_decl}.
	 * @param ctx the parse tree
	 */
	void exitFn_decl(@NotNull ManaParser.Fn_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(@NotNull ManaParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(@NotNull ManaParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#optional_param}.
	 * @param ctx the parse tree
	 */
	void enterOptional_param(@NotNull ManaParser.Optional_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#optional_param}.
	 * @param ctx the parse tree
	 */
	void exitOptional_param(@NotNull ManaParser.Optional_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#import_sequence}.
	 * @param ctx the parse tree
	 */
	void enterImport_sequence(@NotNull ManaParser.Import_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#import_sequence}.
	 * @param ctx the parse tree
	 */
	void exitImport_sequence(@NotNull ManaParser.Import_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(@NotNull ManaParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(@NotNull ManaParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_bin_and}.
	 * @param ctx the parse tree
	 */
	void enterOp_bin_and(@NotNull ManaParser.Op_bin_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_bin_and}.
	 * @param ctx the parse tree
	 */
	void exitOp_bin_and(@NotNull ManaParser.Op_bin_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#import_block}.
	 * @param ctx the parse tree
	 */
	void enterImport_block(@NotNull ManaParser.Import_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#import_block}.
	 * @param ctx the parse tree
	 */
	void exitImport_block(@NotNull ManaParser.Import_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#typedef_decl}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_decl(@NotNull ManaParser.Typedef_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#typedef_decl}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_decl(@NotNull ManaParser.Typedef_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#templates}.
	 * @param ctx the parse tree
	 */
	void enterTemplates(@NotNull ManaParser.TemplatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#templates}.
	 * @param ctx the parse tree
	 */
	void exitTemplates(@NotNull ManaParser.TemplatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_bin_xor}.
	 * @param ctx the parse tree
	 */
	void enterOp_bin_xor(@NotNull ManaParser.Op_bin_xorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_bin_xor}.
	 * @param ctx the parse tree
	 */
	void exitOp_bin_xor(@NotNull ManaParser.Op_bin_xorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_pointer}.
	 * @param ctx the parse tree
	 */
	void enterOp_pointer(@NotNull ManaParser.Op_pointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_pointer}.
	 * @param ctx the parse tree
	 */
	void exitOp_pointer(@NotNull ManaParser.Op_pointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(@NotNull ManaParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(@NotNull ManaParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull ManaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull ManaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#match_elt}.
	 * @param ctx the parse tree
	 */
	void enterMatch_elt(@NotNull ManaParser.Match_eltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#match_elt}.
	 * @param ctx the parse tree
	 */
	void exitMatch_elt(@NotNull ManaParser.Match_eltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_mult}.
	 * @param ctx the parse tree
	 */
	void enterOp_mult(@NotNull ManaParser.Op_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_mult}.
	 * @param ctx the parse tree
	 */
	void exitOp_mult(@NotNull ManaParser.Op_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#class_operator}.
	 * @param ctx the parse tree
	 */
	void enterClass_operator(@NotNull ManaParser.Class_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#class_operator}.
	 * @param ctx the parse tree
	 */
	void exitClass_operator(@NotNull ManaParser.Class_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMatch_stmt(@NotNull ManaParser.Match_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#match_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMatch_stmt(@NotNull ManaParser.Match_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#class_attribute}.
	 * @param ctx the parse tree
	 */
	void enterClass_attribute(@NotNull ManaParser.Class_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#class_attribute}.
	 * @param ctx the parse tree
	 */
	void exitClass_attribute(@NotNull ManaParser.Class_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(@NotNull ManaParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(@NotNull ManaParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_and}.
	 * @param ctx the parse tree
	 */
	void enterOp_and(@NotNull ManaParser.Op_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_and}.
	 * @param ctx the parse tree
	 */
	void exitOp_and(@NotNull ManaParser.Op_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(@NotNull ManaParser.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(@NotNull ManaParser.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull ManaParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull ManaParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_assign}.
	 * @param ctx the parse tree
	 */
	void enterOp_assign(@NotNull ManaParser.Op_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_assign}.
	 * @param ctx the parse tree
	 */
	void exitOp_assign(@NotNull ManaParser.Op_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#obj_fields}.
	 * @param ctx the parse tree
	 */
	void enterObj_fields(@NotNull ManaParser.Obj_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#obj_fields}.
	 * @param ctx the parse tree
	 */
	void exitObj_fields(@NotNull ManaParser.Obj_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(@NotNull ManaParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(@NotNull ManaParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#class_or_interface_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_or_interface_type(@NotNull ManaParser.Class_or_interface_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#class_or_interface_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_or_interface_type(@NotNull ManaParser.Class_or_interface_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull ManaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull ManaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#enum_decl}.
	 * @param ctx the parse tree
	 */
	void enterEnum_decl(@NotNull ManaParser.Enum_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#enum_decl}.
	 * @param ctx the parse tree
	 */
	void exitEnum_decl(@NotNull ManaParser.Enum_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_unary}.
	 * @param ctx the parse tree
	 */
	void enterOp_unary(@NotNull ManaParser.Op_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_unary}.
	 * @param ctx the parse tree
	 */
	void exitOp_unary(@NotNull ManaParser.Op_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#fn_header}.
	 * @param ctx the parse tree
	 */
	void enterFn_header(@NotNull ManaParser.Fn_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#fn_header}.
	 * @param ctx the parse tree
	 */
	void exitFn_header(@NotNull ManaParser.Fn_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#fn_param}.
	 * @param ctx the parse tree
	 */
	void enterFn_param(@NotNull ManaParser.Fn_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#fn_param}.
	 * @param ctx the parse tree
	 */
	void exitFn_param(@NotNull ManaParser.Fn_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void enterInterface_definition(@NotNull ManaParser.Interface_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void exitInterface_definition(@NotNull ManaParser.Interface_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#skip_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSkip_stmt(@NotNull ManaParser.Skip_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#skip_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSkip_stmt(@NotNull ManaParser.Skip_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_or}.
	 * @param ctx the parse tree
	 */
	void enterOp_or(@NotNull ManaParser.Op_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_or}.
	 * @param ctx the parse tree
	 */
	void exitOp_or(@NotNull ManaParser.Op_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#interface_operator}.
	 * @param ctx the parse tree
	 */
	void enterInterface_operator(@NotNull ManaParser.Interface_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#interface_operator}.
	 * @param ctx the parse tree
	 */
	void exitInterface_operator(@NotNull ManaParser.Interface_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#match_else}.
	 * @param ctx the parse tree
	 */
	void enterMatch_else(@NotNull ManaParser.Match_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#match_else}.
	 * @param ctx the parse tree
	 */
	void exitMatch_else(@NotNull ManaParser.Match_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull ManaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull ManaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#fn_params_expressions}.
	 * @param ctx the parse tree
	 */
	void enterFn_params_expressions(@NotNull ManaParser.Fn_params_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#fn_params_expressions}.
	 * @param ctx the parse tree
	 */
	void exitFn_params_expressions(@NotNull ManaParser.Fn_params_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#fn_param_expression}.
	 * @param ctx the parse tree
	 */
	void enterFn_param_expression(@NotNull ManaParser.Fn_param_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#fn_param_expression}.
	 * @param ctx the parse tree
	 */
	void exitFn_param_expression(@NotNull ManaParser.Fn_param_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ManaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ManaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(@NotNull ManaParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(@NotNull ManaParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_shift}.
	 * @param ctx the parse tree
	 */
	void enterOp_shift(@NotNull ManaParser.Op_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_shift}.
	 * @param ctx the parse tree
	 */
	void exitOp_shift(@NotNull ManaParser.Op_shiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_stmt(@NotNull ManaParser.Repeat_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_stmt(@NotNull ManaParser.Repeat_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#module_decl}.
	 * @param ctx the parse tree
	 */
	void enterModule_decl(@NotNull ManaParser.Module_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#module_decl}.
	 * @param ctx the parse tree
	 */
	void exitModule_decl(@NotNull ManaParser.Module_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ManaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ManaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#import_sequence_list}.
	 * @param ctx the parse tree
	 */
	void enterImport_sequence_list(@NotNull ManaParser.Import_sequence_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#import_sequence_list}.
	 * @param ctx the parse tree
	 */
	void exitImport_sequence_list(@NotNull ManaParser.Import_sequence_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull ManaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull ManaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#namespace_list}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_list(@NotNull ManaParser.Namespace_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#namespace_list}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_list(@NotNull ManaParser.Namespace_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(@NotNull ManaParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(@NotNull ManaParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#optional_params}.
	 * @param ctx the parse tree
	 */
	void enterOptional_params(@NotNull ManaParser.Optional_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#optional_params}.
	 * @param ctx the parse tree
	 */
	void exitOptional_params(@NotNull ManaParser.Optional_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ManaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ManaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#interface_decl}.
	 * @param ctx the parse tree
	 */
	void enterInterface_decl(@NotNull ManaParser.Interface_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#interface_decl}.
	 * @param ctx the parse tree
	 */
	void exitInterface_decl(@NotNull ManaParser.Interface_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(@NotNull ManaParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(@NotNull ManaParser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#import_statements}.
	 * @param ctx the parse tree
	 */
	void enterImport_statements(@NotNull ManaParser.Import_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#import_statements}.
	 * @param ctx the parse tree
	 */
	void exitImport_statements(@NotNull ManaParser.Import_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_bin_or}.
	 * @param ctx the parse tree
	 */
	void enterOp_bin_or(@NotNull ManaParser.Op_bin_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_bin_or}.
	 * @param ctx the parse tree
	 */
	void exitOp_bin_or(@NotNull ManaParser.Op_bin_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull ManaParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull ManaParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#class_extends}.
	 * @param ctx the parse tree
	 */
	void enterClass_extends(@NotNull ManaParser.Class_extendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#class_extends}.
	 * @param ctx the parse tree
	 */
	void exitClass_extends(@NotNull ManaParser.Class_extendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#type_list}.
	 * @param ctx the parse tree
	 */
	void enterType_list(@NotNull ManaParser.Type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#type_list}.
	 * @param ctx the parse tree
	 */
	void exitType_list(@NotNull ManaParser.Type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#foreach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForeach_stmt(@NotNull ManaParser.Foreach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#foreach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForeach_stmt(@NotNull ManaParser.Foreach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#static_method}.
	 * @param ctx the parse tree
	 */
	void enterStatic_method(@NotNull ManaParser.Static_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#static_method}.
	 * @param ctx the parse tree
	 */
	void exitStatic_method(@NotNull ManaParser.Static_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#static_class_attribute}.
	 * @param ctx the parse tree
	 */
	void enterStatic_class_attribute(@NotNull ManaParser.Static_class_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#static_class_attribute}.
	 * @param ctx the parse tree
	 */
	void exitStatic_class_attribute(@NotNull ManaParser.Static_class_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#enum_elt}.
	 * @param ctx the parse tree
	 */
	void enterEnum_elt(@NotNull ManaParser.Enum_eltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#enum_elt}.
	 * @param ctx the parse tree
	 */
	void exitEnum_elt(@NotNull ManaParser.Enum_eltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_compare}.
	 * @param ctx the parse tree
	 */
	void enterOp_compare(@NotNull ManaParser.Op_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_compare}.
	 * @param ctx the parse tree
	 */
	void exitOp_compare(@NotNull ManaParser.Op_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(@NotNull ManaParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(@NotNull ManaParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#interface_method}.
	 * @param ctx the parse tree
	 */
	void enterInterface_method(@NotNull ManaParser.Interface_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#interface_method}.
	 * @param ctx the parse tree
	 */
	void exitInterface_method(@NotNull ManaParser.Interface_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(@NotNull ManaParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(@NotNull ManaParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#enum_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_list(@NotNull ManaParser.Enum_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#enum_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_list(@NotNull ManaParser.Enum_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(@NotNull ManaParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(@NotNull ManaParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ManaParser#op_header}.
	 * @param ctx the parse tree
	 */
	void enterOp_header(@NotNull ManaParser.Op_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManaParser#op_header}.
	 * @param ctx the parse tree
	 */
	void exitOp_header(@NotNull ManaParser.Op_headerContext ctx);
}