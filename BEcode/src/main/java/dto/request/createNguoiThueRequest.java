package dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@Data

public class createNguoiThueRequest {
    String hoTen;
    String diaChi;
    Instant ngaySinh;
    String cccd;
    String sdt;
}
