package dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@Data

public class createNguoiThueResponse {
    String hoTen;
    String diaChi;
    Instant ngaySinh;
    String cccd;
    String sdt;
}
