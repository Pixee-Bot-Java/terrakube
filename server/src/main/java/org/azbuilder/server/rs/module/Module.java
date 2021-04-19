package org.azbuilder.server.rs.module;


import com.yahoo.elide.annotation.Include;
import lombok.Getter;
import lombok.Setter;
import org.azbuilder.server.rs.Organization;
import org.azbuilder.server.rs.workspace.Workspace;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Include(type = "module")
@Getter
@Setter
@Entity
public class Module {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @ManyToOne
    private Organization organization;

    @OneToMany(mappedBy = "module")
    private List<Version> version;
}
