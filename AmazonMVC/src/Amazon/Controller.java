package Amazon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Amazon.Components.ProductPanels;

public class Controller {
    private Model m_model;
    private View m_view;
    ProductPanels myPanels = new ProductPanels();
    
    Controller(Model model, View view) {
        m_model = model;
        m_view = view;

        view.addLogoListener(new LogoListener());
        view.addSearchButtonListener(new SearchButtonListener());
        view.addTodaysDealsListener(new TodaysDealsListener());
        view.addBestSellersListener(new BestSellersListener());
        view.addCustomerServiceListener(new CustomerServiceListener());
        view.addFindaGiftListener(new FindaGiftListener());
        view.addRegistryListener(new RegistryListener());
        view.addNewReleasesListener(new NewReleasesListener());
        view.addMyCartListener(new MyCartListener());
    }

    class LogoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	m_view.showScrollPane(myPanels.AllProducts());
        }
    }

    class SearchButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class TodaysDealsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	m_view.showScrollPane(myPanels.TodaysDeals());
        }
    }

    class BestSellersListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	m_view.showScrollPane(myPanels.BestSellers());
        }
    }
//Find a gift listener
    class FindaGiftListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	m_view.showScrollPane(myPanels.FindaGift());
        }
    }
//Customer Service Listener
    class CustomerServiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	m_view.showScrollPane(myPanels.CustomerService());
        }
    }
    

    // Added functionality for Registry
    class RegistryListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	m_view.showScrollPane(myPanels.RegistryPanel());
        }
    }
//Added functionality for New Releases
    class NewReleasesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	m_view.showScrollPane(myPanels.NewReleases());
        }
    }

    
//Books functionality after click
    class BooksListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
    }

    class MyCartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        	m_view.showScrollPane(myPanels.Books());

        	m_view.showScrollPane(myPanels.MyCart());

        }
    }
  
}
