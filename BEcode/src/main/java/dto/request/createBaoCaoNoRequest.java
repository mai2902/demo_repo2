package dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Month;

@NoArgsConstructor
@Data

public class createBaoCaoNoRequest {
    long phong_id;
    BigDecimal noDau;
    BigDecimal noCuoi;
    Month thang;
}
