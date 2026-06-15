package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
      AnnotationConfigApplicationContext context =
                                        new AnnotationConfigApplicationContext(AppConfig.class);


        PrintQuotesConstructor pc=context.getBean(PrintQuotesConstructor.class);

        PrintQuotesSetter ps =context.getBean(PrintQuotesSetter.class);

        PrintQuotesField pf=context.getBean(PrintQuotesField.class);

        DisplayQuotes dq=context.getBean(DisplayQuotes.class);

        pc.print();
        ps.print();
        pf.print();
        dq.display();

        context.close();

    }
}