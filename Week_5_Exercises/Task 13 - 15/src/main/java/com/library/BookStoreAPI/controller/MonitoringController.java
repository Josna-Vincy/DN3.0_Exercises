package com.library.BookStoreAPI.controller;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/monitor")
public class MonitoringController {

    private final MeterRegistry meterRegistry;

    public MonitoringController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @GetMapping("/book-request")
    public String bookRequest() {
        meterRegistry.counter("custom.metric.book_requests").increment();
        return "Book request counted!";
    }
}
