package org.fastcode.popup.actions.snippet;

import static org.fastcode.preferences.PreferenceConstants.DATABASE_TEMPLATE_INSERT_NAMED_QUERY;
import static org.fastcode.preferences.PreferenceConstants.P_DATABASE_TEMPLATE_PREFIX;

public class CreateNewDatabaseInsertWithNamedQueryAction extends CreateSqlGenericNamedQueryViewAction {

	public CreateNewDatabaseInsertWithNamedQueryAction() {
		this.templatePrefix = P_DATABASE_TEMPLATE_PREFIX;
		this.templateType = DATABASE_TEMPLATE_INSERT_NAMED_QUERY;
	}

	/*@Override
	public String getTemplateTypeForNamedQuery() {
		return P_ADDITIONAL_DATABASE_TEMPLATE_PREFIX + UNDERSCORE + "sql.insert.format";
	}*/

	@Override
	protected String[] getFieldTypesForHql() {
		// TODO Auto-generated method stub
		return null;
	}
}
