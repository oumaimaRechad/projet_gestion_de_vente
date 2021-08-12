<%@ include file="common/navigation.jspf"%>
<%@ include file="common/header.jspf"%>
   
    <div class="breadcrumbs">
            <div class="col-sm-4">
                <div >
                    <div >
                        <h1>Liste Des Factures</h1>
                    </div>
                </div>
            </div>
            
        </div>
        

   

            
                        <div class="card-body">
                            <table class="table">
                              <thead class="thead-dark">
                                <tr>
                                  <th scope="col">numero de facture</th>
                                  <th scope="col">Client</th>
                                  <th scope="col">Date</th>
                                  
                                  <th scope="col">Mode Reglement</th>
                                  
                                  <th scope="col">Total TTC</th>
                                  
                                  <th scope="col">Reste </th>
                                   <th scope="col">Details </th>
                                 
                                  
                                </tr>
                              </thead>
                              <c:forEach items="${factures}" var="facture">
                              <tbody>
                                
                                
        <tr>
            
            <td>451110${facture.codeFct}</td>
              <td>${facture.clt.nomClt}</td>
              <td>${facture.dateFct}</td>
            <td> &nbsp; &nbsp; &nbsp; &nbsp;${facture.modeRglt}</td>
            
            <td>${facture.totalFct}</td>
            <td>${facture.resteFct}</td>
             <td> <div class="container">
           
         
           <form action="facture.action" method="get">
            <button type="submit" class="btn btn-success btn-sm mt-2" value="${facture.codeFct}" name="codeFct">Facture</button>
            </form>
    </div>
    </td>
    

   
   
            
    </tr>
       
                               
                              </tbody>
                              </c:forEach>
                            </table>

                        </div>
               


               

   
<%@ include file="common/footer.jspf"%>