/*************************************************************/
/* @Author 		: heiko lauer                                */
/* @Date        : 2017.02.16                                 */
/* @Last Change : 2017.02.22                                 */
/* @Description : TO for the ArticelTypeCategorie            */
/*                will convert to Bean ArticelTypeCategorie  */
/* @Scope		: Session                                    */            
/*************************************************************/

package com.pinhost.common.webshopxxl2.to;

public class ArtikelTypCategorieTO {

	private Long id;
	private String name;
	private String image;
	
	/**** Getter and Setter *******************/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
