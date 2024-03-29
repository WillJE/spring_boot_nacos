package will.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("sidecar-simple")
public interface SidecarFeign {
    @GetMapping("hello")
    String hello();
}
