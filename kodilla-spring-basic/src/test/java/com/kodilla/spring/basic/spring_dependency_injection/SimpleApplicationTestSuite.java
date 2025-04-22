package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.dependency_injection.MessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class SimpleApplicationTestSuite {

    @Autowired
    private SimpleApplication simpleApplication;

    @Autowired
    private MessageService messageService;

    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SkypeMessageService bean = context.getBean(SkypeMessageService.class);
        String message = bean.send("Test", "Any receiver");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }
//
//    @Test
//    void shouldSendMessageWhenReceiverIsValid() {
//        simpleApplication.processMessage("Cześć!", "anna@example.com");
//
//        verify(messageService).send("Cześć!", "anna@example.com");
//    }
//
//    @Test
//    void shouldNotSendMessageWhenReceiverIsNull() {
//        simpleApplication.processMessage("Hej!", null);
//
//        verifyNoInteractions(messageService);
//    }
//
//    @Test
//    void shouldNotSendMessageWhenReceiverIsEmpty() {
//        simpleApplication.processMessage("Yo!", "");
//
//        verifyNoInteractions(messageService);
//    }
@Test
void shouldSendMessageIfReceiverIsValid() {
    // given
    MessageService messageService = mock(MessageService.class);
    SimpleApplication app = new SimpleApplication();

    // when
    app.processMessage("Hello", "john@example.com");

    // then
    verify(messageService).send("Hello", "john@example.com");
}

    @Test
    void shouldNotSendMessageIfReceiverIsNull() {
        // given
        MessageService messageService = mock(MessageService.class);
        SimpleApplication app = new SimpleApplication();

        // when
        app.processMessage("Hello", null);

        // then
        verifyNoInteractions(messageService);
    }

    @Test
    void shouldNotSendMessageIfReceiverIsEmpty() {
        // given
        MessageService messageService = mock(MessageService.class);
        SimpleApplication app = new SimpleApplication();

        // when
        app.processMessage("Hello", "");

        // then
        verifyNoInteractions(messageService);
    }
}
