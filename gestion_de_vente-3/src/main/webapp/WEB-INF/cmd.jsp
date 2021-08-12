<%@ include file="jsp/common/navigation.jspf"%>
<%@ include file="jsp/common/header.jspf"%>
   
    <div class="breadcrumbs">
            <div >
                <div >
                    <div class="page-title">
                        <h1>Liste Des Commandes</h1>
                    </div>
                </div>
            </div>
            
        </div>
        

   

                <div class="col-lg-6">
                 <br/>
                <div class="container">
            <button class="btn btn-danger btn-mini" data-toggle="modal" data-target="#editUserModal">
               nouveau Commande
            </button>
            
    </div>
    <br/>
    
    <div class="modal fade" id="editUserModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <form  role="form" action="addCommande.action" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        
                    </div>
                    <div class="modal-body">
                        
                        <div class="form-group">
                            <label for="qteCmd">quantité</label>
                            <input id="qteCmd" name="qteCmd" placeholder="qteCmd" class="form-control" type="number" value=""/>
                        </div>
                        <div class="form-group">
                            <label for="dateCmd">Date</label>
                            <input id="dateCmd" name="dateCmd" placeholder="description" class="form-control" type="date" value=""/>
                        </div>
               
                        


<div class="form-group" >
	
	
		 <label for="client">Société</label>
		<select name="idClt" class="form-control">
		<option  value="" >
					
					-Selectionnez-
				</option>
			<c:forEach items="${clients}" var="client">
				<option  value="${client.idClt}" >
					
					${client.nomClt}
				</option>
			</c:forEach>
		</select>
		
		
	
</div>
         <div class="form-group" >
                        <label for="etatCmd">Etat De Commande</label>
                       
                            <select name="etatCmd" class="form-control">
			<option  value="" >
					
					-choisir un etat-
				</option>
				<option  value="en_cours" >
					
					En cours
				</option>
			<option  value="valide" >
					
					  &nbsp;validé&nbsp;
				</option>
		</select> </div>

                       
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary">enregistrer</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div><!-- /.modal-content -->
            </form>
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
   
                   
                    
                       
                           
                        </div>
                       
                            <table class="table">
                              <thead class="thead-dark">
                                <tr>
                                  <th scope="col">numero de commande</th>
                                  <th scope="col">societe</th>
                                  <th scope="col">quantité </th>
                                  
                                  <th scope="col">date</th>
                                  
                                  <th scope="col">etat</th>
                                  
                                  <th scope="col">statut </th>
                                 
                                  
                                </tr>
                              </thead>
                              <c:forEach items="${commandes}" var="commande">
                              <tbody>
                                
                                
        <tr>
            
            <td>2100001${commande.codeCmd}</td>
              <td>${commande.clt.nomClt}</td>
            <td>${commande.qteCmd}</td>
            <td>${commande.dateCmd}</td>
            
  
           
            <td>
    
    <form action="updateEtat.action" method="get">
 
           <button type="submit" class="btn btn-success btn-sm mt-2"  value="${commande.codeCmd}" name="codeCmd" >&nbsp;&nbsp;${commande.etatCmd}&nbsp;&nbsp;</button>
       
         
          
          </form>
    
    </td>
            <td> <div class="container">
           <form action="updateActive.action" method="get">
          <button type="submit" class="btn btn-success btn-sm mt-2" value="${commande.codeCmd}" name="codeCmd" >&nbsp; &nbsp;${commande.active}&nbsp; &nbsp;</button>
          
          
          </form>
          
         
    </div>
    </td>
   
            
    </tr>
       
                               
                              </tbody>
                              </c:forEach>
                            </table>

                       
                  
               


               

   
<%@ include file="jsp/common/footer.jspf"%>