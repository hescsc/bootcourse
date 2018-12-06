package com.hescsc.springboot.cf01;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Service
public class DateCalculationServiceImpl implements DateCalculationService {


    @Override
    public long secondsLeftInThisYear() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newYear = LocalDate.of(now.getYear() + 1, 1, 1).atStartOfDay();
        return Duration.between(now, newYear).getSeconds();
    }


}
