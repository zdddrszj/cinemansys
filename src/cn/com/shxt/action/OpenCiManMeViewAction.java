package cn.com.shxt.action;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

import cn.com.shxt.view.CinemaManagermentMenuView;

public class OpenCiManMeViewAction extends Action {
	private IWorkbenchWindow window;

	public OpenCiManMeViewAction(IWorkbenchWindow window) {
		super();
		this.window = window;
	}

	@Override
	public void run() {
		try {
			window.getActivePage().showView(CinemaManagermentMenuView.ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
