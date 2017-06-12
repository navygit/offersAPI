package com.example.demoRestApi;

public class Service {
    private Repository repository;

    public Service(final Repository repository){
        this.repository=repository;
    }

    public Model save (Model model) {
        return repository.save(model);
    }
}
