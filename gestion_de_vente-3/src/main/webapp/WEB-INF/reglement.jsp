<%@ include file="jsp/common/navigation.jspf"%>
<%@ include file="jsp/common/header.jspf"%>
   
    <div class="breadcrumbs">
            <div class="col-sm-4">
                <div class="page-header float-left">
                    <div class="page-title">
                        <h1>Encaissement</h1>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="page-header float-right">
                   
                </div>
            </div>
        </div>
        

   

       <div class="modal-dialog">
            <form  role="form" action="payer.action" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        
                    </div>
                    <div class="modal-body">
                        
                        
                        <div class="form-group" >
                        <label for="cltId">Société </label>
                            <select name="cltId" class="form-control">
                            <option  value="" >
					
					-choisir la sociéte-
				</option>
			<c:forEach items="${clients}" var="client">
				<option  value="${client.idClt}" >
					
					${client.nomClt}
				</option>
			</c:forEach>
		</select>
                        </div>
                        
                        
                        
                        
                          <div class="form-group" >
	
	
		 <label for="codeFacture">Facture </label>
		<select name="codeFacture" class="form-control">
		<option  value="" >
					
					-Selectionnez une facture-
				</option>
			<c:forEach items="${factures}" var="facture">
				<option  value="${facture.codeFct}" >
					
					${facture.codeFct}
				</option>
			</c:forEach>
		</select>
		
	
</div>
<div class="form-group">
                            <label for="TotalTTC">Total TTC</label>
                            <input id="TotalTTC" name="TotalTTC" placeholder="TotalTTC" class="form-control" type="number" value=""/>
                        </div>

<div class="form-group">
                            <label for="montantApayer">Montant à payer</label>
                            <input id="montantApayer" name="montantApayer" placeholder="montant A payer" class="form-control" type="number" value=""/>
                        </div>
               
                          <div class="form-group" >
	
	
		 
		<select name="modeReglements" class="form-control">
			
				<option  value="" >
					
				---selectionnez---
				</option>
				<option  value="Espece" >
					
					 Espece
				</option>
				<option  value="cheque" >
					
					Cheque
				</option>
			
		</select>
		
	
</div>
                       
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary">enregistrer</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </form>
   
   
                </div>    
              


               

   
<%@ include file="jsp/common/footer.jspf"%>