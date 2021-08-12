<%@ include file="jsp/common/navigation.jspf"%>
<%@ include file="jsp/common/header.jspf"%>
   
    <div class="breadcrumbs">
            <div class="col-sm-4">
                <div class="page-header float-left">
                    <div class="page-title">
                        <h1>nouveau ligne de commande</h1>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="page-header float-right">
                   
                </div>
            </div>
        </div>
        

   

       <div class="modal-dialog">
            <form  role="form" action="ligneCmd.action" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        
                    </div>
                    <div class="modal-body">
                        
                        
          

<div class="form-group" >
	
	
		<label for="codeCmd"> La  Commande</label>
		<select name="codeCmd" class="form-control">
		<option  value="" >
					
					-Selectionnez une commande-
				</option>
			<c:forEach items="${commandes}" var="commande">
			
				<option  value="${commande.codeCmd}" >
					
					${commande.codeCmd}
				</option>
			</c:forEach>
		</select>
		
		
	
</div>
              
                          <div class="form-group" >
	
	
		  <label for="codeArt">  Articles</label>
		<select name="codeArt" class="form-control" >
		<option  value="" >
					
					-choisir un  article-
				</option>
			<c:forEach items="${articles}" var="article">
				<option  value="${article.codeArt}" >
					
					${article.nomArt}
				</option>
			</c:forEach>
		</select>
		
		
	
</div>
                  <div class="form-group">
                            <label for="qteCmd">  Quantité</label>
                            <input id="qteCmd" name="qteCmd" placeholder="qteCmd" class="form-control" type="number" value=""/>
                            <c:if test="${ qteCmd > stock }" >
                            <span style="color:red;"> Cette quantité n'existe pas au stock !</span>
                            </c:if>
                        </div>     
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary">enregistrer</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div><!-- /.modal-content -->
            </form>
        </div><!-- /.modal-dialog -->

               

   
<%@ include file="jsp/common/footer.jspf"%>