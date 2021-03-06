/**
 * This file is part of mycollab-web.
 *
 * mycollab-web is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-web is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-web.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.crm.view.campaign;

import com.mycollab.common.i18n.GenericI18Enum;
import com.mycollab.module.crm.domain.SimpleAccount;
import com.mycollab.module.crm.domain.criteria.AccountSearchCriteria;
import com.mycollab.module.crm.ui.components.RelatedItemSelectionWindow;
import com.mycollab.module.crm.view.account.AccountSearchPanel;
import com.mycollab.module.crm.view.account.AccountTableDisplay;
import com.mycollab.module.crm.view.account.AccountTableFieldDef;
import com.mycollab.vaadin.AppContext;
import com.mycollab.vaadin.web.ui.WebUIConstants;
import com.vaadin.ui.Button;

import java.util.Arrays;

/**
 * @author MyCollab Ltd.
 * @since 1.0
 */
public class CampaignAccountSelectionWindow extends RelatedItemSelectionWindow<SimpleAccount, AccountSearchCriteria> {
    private static final long serialVersionUID = 1L;

    public CampaignAccountSelectionWindow(CampaignAccountListComp associateAccountList) {
        super("Select Accounts", associateAccountList);
        this.setWidth("1000px");
    }

    @Override
    protected void initUI() {
        tableItem = new AccountTableDisplay(AccountTableFieldDef.selected(),
                Arrays.asList(AccountTableFieldDef.accountname(),
                        AccountTableFieldDef.phoneoffice(),
                        AccountTableFieldDef.email(), AccountTableFieldDef.city()));

        Button selectBtn = new Button(AppContext.getMessage(GenericI18Enum.BUTTON_SELECT), clickEvent -> close());
        selectBtn.setStyleName(WebUIConstants.BUTTON_ACTION);

        AccountSearchPanel accountSimpleSearchPanel = new AccountSearchPanel();
        accountSimpleSearchPanel.addSearchHandler(criteria -> tableItem.setSearchCriteria(criteria));

        bodyContent.with(accountSimpleSearchPanel, selectBtn, tableItem);
    }
}
