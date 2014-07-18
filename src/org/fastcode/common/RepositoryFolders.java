/**
 * This class has been generated by Fast Code Eclipse Plugin
 * For more information please go to http://fast-code.sourceforge.net/
 * @author : KrishV
 * Created : 09/23/2013 10:44:03
 */

package org.fastcode.common;

import org.fastcode.common.RepositoryFolder;



public class RepositoryFolders {

	private final RepositoryFolder repositoryFolder[];


	/**
	 *
	 * getter method for repositoryFolder
	 * @return
	 *
	 */
	public RepositoryFolder[] getRepositoryFolder() {
		return this.repositoryFolder;
	}

	private RepositoryFolders(final Builder builder){
		 this.repositoryFolder = builder.repositoryFolder;
}

	public static class Builder{

		private RepositoryFolder[] repositoryFolder;

		public Builder(){
		}

		public RepositoryFolders build() {
			return new RepositoryFolders(this);
		}

		public Builder withRepositoryFolder(final RepositoryFolder[] repositoryFolder) {
			this.repositoryFolder = repositoryFolder;
			return this;
		}
	}



}