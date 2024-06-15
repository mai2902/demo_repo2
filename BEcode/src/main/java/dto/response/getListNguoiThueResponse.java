package dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@Data
public class getListNguoiThueResponse {
    long id;
    String hoTen;
    String diaChi;
    Instant ngaySinh;
    String cccd;
    String sdt;
}
