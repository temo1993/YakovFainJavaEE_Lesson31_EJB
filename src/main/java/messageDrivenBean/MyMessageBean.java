package messageDrivenBean;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName="jms/testQueue", activationConfig = {
        @ActivationConfigProperty(propertyName = "acknowledgeMode",
                propertyValue = "Auto-acknowledge"),
        @ActivationConfigProperty(propertyName = "destinationType",
                propertyValue = "javax.jms.Queue")
})
public class MyMessageBean implements MessageListener {
    MessageDrivenContext ctx;
    // A no-argument constructor is required
    public MyMessageBean() {}
    public void onMessage(Message message){
        // The business logic is implemented here.
    }
}
