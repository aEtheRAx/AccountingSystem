package za.ac.nwu.as.logic.flow.impl;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import za.ac.nwu.as.domain.dto.AccountHolderDto;
import za.ac.nwu.as.domain.dto.AccountTypeDto;
import za.ac.nwu.as.domain.persistence.AccountType;
import za.ac.nwu.as.domain.service.GeneralResponse;
import za.ac.nwu.as.logic.flow.CreateAccountTypeFlow;
import za.ac.nwu.as.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.as.logic.flow.ModifyAccountTypeFlow;
import za.ac.nwu.as.translator.AccountTypeTranslator;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class FetchAccountTypeFlowImplTest {

    @Mock
    private FetchAccountTypeFlowImpl fetchAccountTypeFlow;

    @Before
    public void setUp() throws Exception {
        fetchAccountTypeFlow = new FetchAccountTypeFlowImpl(null);
    }

    @After
    public void tearDown() throws Exception {
        fetchAccountTypeFlow = null;
    }

    //@Ignore
    @Test
    public void methodToTest() {
        assertTrue(fetchAccountTypeFlow.methodToTest());
    }

    @Test
    public void getAllAccountTypes() {

    }

/*
    @Test
    public void getAccountTypeByMnemonic() {
        AccountTypeDto accountTypeDto = new AccountTypeDto("MILES","accountTypeName",LocalDate.parse("2020-02-02"));
        //translator.getAccountTypeByMnemonic(anyString());

    }*/
}