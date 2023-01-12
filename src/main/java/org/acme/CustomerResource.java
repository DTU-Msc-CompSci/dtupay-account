package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customer")
public class CustomerResource {

    private CustomerService customerService = new CustomerService();

    // TODO: Change User to whatever type is needed as wrapper
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postCustomer(User user) {
        // TODO: Refactor this part out
        User internalUser = new User(user.firstName, user.lastName, user.cprNumber, user.bankId, customerService.generateUniqueId());
        customerService.addCustomer(internalUser);
        return Response.ok().build();
    }
}