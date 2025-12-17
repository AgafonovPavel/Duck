package autotests.config;

import com.consol.citrus.report.HtmlReporter;
import com.consol.citrus.report.JUnitReporter;
import com.consol.citrus.report.LoggingReporter;
import com.consol.citrus.report.TestReporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CitrusConfig {

    /**
     * JUnitReporter — автоматически пишет в:
     * build/reports/tests/test/
     */
    @Bean
    public TestReporter junitReporter() {
        return new JUnitReporter();
    }

    /**
     * LoggingReporter — логирует в консоль
     */
    @Bean
    public TestReporter loggingReporter() {
        return new LoggingReporter();
    }

    /**
     * HtmlReporter — пишет HTML в:
     * build/reports/citrus/html/
     *
     * В 3.4.0 нельзя задать путь или префикс через setReportPath/setPrefix
     */
    @Bean
    public TestReporter htmlReporter() {
        return new HtmlReporter();
    }
}