package org.eclipse.leshan.client.demo;

import org.eclipse.leshan.client.resource.BaseInstanceEnabler;
import org.eclipse.leshan.core.response.ExecuteResponse;
import org.eclipse.leshan.core.response.ReadResponse;

public class Temperature extends BaseInstanceEnabler {

	@Override
    public ReadResponse read(int resourceid) {
        switch (resourceid) {
        case 5700:
            return ReadResponse.success(resourceid, 0.0f);
        case 5601:
            return ReadResponse.success(resourceid, 0.0f);
        case 5602:
            return ReadResponse.success(resourceid, 0.0f);
        case 5603:
            return ReadResponse.success(resourceid, 0.0f);
        case 5701:
            return ReadResponse.success(resourceid, "");
        default:
            return super.read(resourceid);
        }
    }
    
    @Override
    public ExecuteResponse execute(int resourceid, String params) {
        return ExecuteResponse.success();
    }
    
}
