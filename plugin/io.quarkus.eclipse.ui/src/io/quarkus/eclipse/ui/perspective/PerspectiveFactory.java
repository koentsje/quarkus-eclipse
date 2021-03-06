/*
 * Copyright 2019 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.quarkus.eclipse.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import io.quarkus.eclipse.ui.view.ExtensionsView;

public class PerspectiveFactory implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		IFolderLayout explorerFolder= layout.createFolder("left", IPageLayout.LEFT, (float)0.25, editorArea); 
		explorerFolder.addView(IPageLayout.ID_PROJECT_EXPLORER);	
		IFolderLayout outputfolder= layout.createFolder("bottom", IPageLayout.BOTTOM, (float)0.75, editorArea); 
		outputfolder.addView(ExtensionsView.ID);			
		IFolderLayout outlineFolder = layout.createFolder("outlines", IPageLayout.RIGHT, 0.75f, editorArea);
		outlineFolder.addView(IPageLayout.ID_OUTLINE);		
		layout.setEditorAreaVisible(true);	
	}
	
}
