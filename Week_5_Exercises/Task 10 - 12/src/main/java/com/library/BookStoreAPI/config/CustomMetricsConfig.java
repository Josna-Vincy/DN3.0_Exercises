package com.library.BookStoreAPI.config;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Configuration;
import javax.annotation.PostConstruct;

@Configuration
public class CustomMetricsConfig {

    private final MeterRegistry meterRegistry;

    public CustomMetricsConfig(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @PostConstruct
    public void initCustomMetrics() {
        meterRegistry.counter("custom.metric.book_requests").increment();
        meterRegistry.gauge("custom.metric.books_in_inventory", 100);
    }
}
