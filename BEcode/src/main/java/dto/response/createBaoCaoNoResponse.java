package dto.response;

import entity.phong;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Month;

@NoArgsConstructor
@Data

public class createBaoCaoNoResponse {
    long Id;
    phong phong;
    BigDecimal noDau;
    BigDecimal noCuoi;
    Month thang;
}
